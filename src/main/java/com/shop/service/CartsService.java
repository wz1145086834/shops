package com.shop.service;

import com.shop.entity.Carts;

import java.util.List;

/**
 * (Cart)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:06:47
 */
public interface CartsService {

    List<Carts> queryAllByUid(int uid);

}