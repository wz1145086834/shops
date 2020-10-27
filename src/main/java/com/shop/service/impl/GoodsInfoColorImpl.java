package com.shop.service.impl;

import com.shop.dao.GoodsInfoColorDao;
import com.shop.entity.GoodsInfoColor;
import com.shop.service.GoodsInfoColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoColorImpl implements GoodsInfoColorService {

    @Resource
    private GoodsInfoColorDao goodsInfoColorDao;
    @Override
    public List<GoodsInfoColor> getAllGoods(Integer bid) {
        return this.goodsInfoColorDao.getAllGoods(bid);
    }

    @Override
    public List<GoodsInfoColor> ascGoods(Integer bid) {
        return this.goodsInfoColorDao.ascGoods(bid);
    }

    @Override
    public List<GoodsInfoColor> descGoods(Integer bid) {
        return this.goodsInfoColorDao.descGoods(bid);
    }
}
