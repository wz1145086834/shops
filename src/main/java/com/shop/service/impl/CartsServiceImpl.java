package com.shop.service.impl;

import com.shop.dao.CartDao;
import com.shop.dao.CartsDao;
import com.shop.entity.Cart;
import com.shop.entity.Carts;
import com.shop.service.CartService;
import com.shop.service.CartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cart)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:06:48
 */
@Service("cartsService")
public class CartsServiceImpl implements CartsService {
    @Resource
    private CartsDao cartsDao;


    @Override
    public List<Carts> queryAllByUid(int uid) {
        return cartsDao.queryAllByUid(uid);
    }
}