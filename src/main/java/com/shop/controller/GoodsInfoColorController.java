package com.shop.controller;


import com.shop.entity.GoodsInfoColor;
import com.shop.service.GoodsInfoColorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("goodsInfoColor")
public class GoodsInfoColorController {

    @Resource
    private GoodsInfoColorService goodsInfoColorService;

    @GetMapping("selectAll")
    public List<GoodsInfoColor> selectAll(Integer bid){
        return this.goodsInfoColorService.getAllGoods(bid);
    }

    @GetMapping("ascGoods")
    public List<GoodsInfoColor> ascGoods(Integer bid){
        return this.goodsInfoColorService.ascGoods(bid);
    }

    @GetMapping("descGoods")
    public List<GoodsInfoColor> descGoods(Integer bid){
        return this.goodsInfoColorService.descGoods(bid);
    }
}
