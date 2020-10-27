package com.shop.dao;

import com.shop.entity.Carts;

import java.util.List;

public interface CartsDao {

    List<Carts> queryAllByUid(int uid);
}
