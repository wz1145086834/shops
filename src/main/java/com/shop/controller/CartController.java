package com.shop.controller;

import com.shop.entity.*;
import com.shop.service.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Cart)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:49
 */
@RestController
@RequestMapping("cart")
public class CartController {
    /**
     * 服务对象
     */
    @Resource
    private CartsService cartsService;
    @Resource
    private CartService cartService;

    @Resource
    private CartitemsService cartitemsService;

    @Resource
    private GoodsService goodsService;

    @Resource
    private InfoService infoService;

    @Resource
    private ColorService colorService;

    @Resource
    private SizeService sizeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cart selectOne(Integer id) {
        return this.cartService.queryById(id);
    }

    @GetMapping("/addCart/{uid}/{gid}/{iid}/{cid}/{sid}")
    public List<Carts> addCart(@PathVariable("uid") int uid,@PathVariable("gid")int gid,@PathVariable("iid")int iid,@PathVariable("cid")int cid,@PathVariable("sid")int sid){
        Cart cart = cartService.queryByUid(uid);
        if(cart==null){
            Goods goods = goodsService.queryById(gid);
            double nprice = goods.getNprice();
            Cart cart1=new Cart(uid, 1, nprice, null, null, null);
            Cart cart2 = cartService.insert(cart1);
            Integer id = cart2.getId();
            Cartitems cartitems = cartitemsService.insert(new Cartitems(id, gid, sid, cid, 1, null, null, null));
            List<Carts> carts = cartsService.queryAllByUid(uid);
            return carts;
        }else{
            Integer id = cart.getId();
            Goods goods = goodsService.queryById(gid);
            double nprice = goods.getNprice();
            List<Cartitems> cartitemss = cartitemsService.queryByid(id);
            for (Cartitems cartitems : cartitemss) {
                Cartitems cartitems1 = cartitemsService.queryByCartitems(new Cartitems(id, gid, sid, cid));
                if(cartitems1!=null){
                    Integer counts = cartitems1.getCounts();
                    Integer ctid = cartitems1.getCtid();
                    Cartitems update = cartitemsService.update(new Cartitems(ctid, id, gid, sid, cid, counts + 1, null, null, null));
                    Integer num = cart.getNum();
                    Object price = cart.getPrice();
                    Object prices=(Double)price+nprice;
                    cartService.update(new Cart(id,uid,num+1,prices,null,null,null));
                    Cart cart1 = cartService.queryByUid(uid);
                    List<Carts> carts = cartsService.queryAllByUid(uid);
                    return carts;
                }
            }
            Object price = cart.getPrice();
            Integer num = cart.getNum();
            Cartitems cartitems = cartitemsService.insert(new Cartitems(id, gid, sid, cid, 1, null, null, null));
            Object prices=(Double)price+nprice;
            Cart cart1 = cartService.update(new Cart(id, uid, num + 1, prices, null, null, null));
            List<Carts> carts = cartsService.queryAllByUid(uid);
            return carts;
        }
    }
    @GetMapping(value = "deleteAll/{uid}",produces = "text/html;charset=UTF-8")
    public String deleteById(@PathVariable("uid") int uid, Model m) {
        Cart cart = cartService.queryByUid(uid);
        Integer id = cart.getId();
        cartitemsService.deleteByid(id);
        boolean b1 = cartService.deleteById(id);
        if(b1==true){
            String mgs="删除成功";
            m.addAttribute("mgs",mgs);
            return mgs;
        }else{
            String mgs="删除失败";
            m.addAttribute("mgs",mgs);
            return mgs;
        }
    }
    @GetMapping(value ="deleteBySidAndCid/{uid}/{gid}/{cid}/{sid}",produces = "text/html;charset=UTF-8")
    public String deleteBySidAndCid(@PathVariable("uid") int uid ,@PathVariable("gid") int gid,@PathVariable("sid") int sid,@PathVariable("cid") int cid, Model m){
        Cart cart = cartService.queryByUid(uid);
        Integer id = cart.getId();
        Integer num = cart.getNum();
        Cartitems cartitems = cartitemsService.queryByCartitems(new Cartitems(id, gid, sid, cid));
        System.out.println(cartitems);
        Integer counts = cartitems.getCounts();
        Goods goods = goodsService.queryById(gid);
        double nprice = goods.getNprice();
        int n=num-counts;
        cartitemsService.deleteBySidAndCid(id, gid, sid, cid);
        Cart cart1 = cartService.update(new Cart(id, uid, n, n * nprice, null, null, null));
        if(cart1!=null){
            String mgs="删除成功";
            m.addAttribute("mgs",mgs);
            return mgs;
        }else{
            String mgs="删除失败";
            m.addAttribute("mgs",mgs);
            return mgs;
        }
    }
}