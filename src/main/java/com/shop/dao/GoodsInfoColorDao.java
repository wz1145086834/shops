package com.shop.dao;

import com.shop.entity.GoodsInfoColor;

import java.util.List;

public interface GoodsInfoColorDao {

    List<GoodsInfoColor> getAllGoods(Integer bid);

    List<GoodsInfoColor> ascGoods(Integer bid);

    List<GoodsInfoColor> descGoods(Integer bid);
}
