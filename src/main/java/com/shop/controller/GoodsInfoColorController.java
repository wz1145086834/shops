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

    @GetMapping("selectAll/{bid}")
    public List<GoodsInfoColor> selectAll(@PathVariable("bid") Integer bid){
        return this.goodsInfoColorService.getAllGoods(bid);
    }

    @GetMapping("ascGoods/{bid}")
    public List<GoodsInfoColor> ascGoods(@PathVariable("bid") Integer bid){
        return this.goodsInfoColorService.ascGoods(bid);
    }

    @GetMapping("descGoods/{bid}")
    public List<GoodsInfoColor> descGoods(@PathVariable("bid") Integer bid){
        return this.goodsInfoColorService.descGoods(bid);
    }
}
