package com.shop.service;

import com.shop.entity.GoodsInfoColor;

import java.util.List;

public interface GoodsInfoColorService {

    List<GoodsInfoColor> getAllGoods(Integer bid);

    List<GoodsInfoColor> ascGoods(Integer bid);

    List<GoodsInfoColor> descGoods(Integer bid);
}
