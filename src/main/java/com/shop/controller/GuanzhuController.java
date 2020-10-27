package com.shop.controller;
import com.shop.entity.Guanzhu;
import com.shop.service.GuanzhuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("guanzhu")
public class GuanzhuController {
    @Resource
    private GuanzhuService userAttentionGoods;

    /*
     * 查询所有关注用户
     * */
    @GetMapping("getUser/{gid}")
    public List<Guanzhu> getUserAttentionGoods(@PathVariable("gid") Integer gid){

        return this.userAttentionGoods.getUserAttentionGoods(gid);
    }
}
