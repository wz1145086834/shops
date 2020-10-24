package com.shop.service;

import com.shop.entity.Cartitems;

import java.util.List;

/**
 * (Cartitems)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:06:52
 */
public interface CartitemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param ctid 主键
     * @return 实例对象
     */
    Cartitems queryById(Integer ctid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cartitems> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cartitems 实例对象
     * @return 实例对象
     */
    Cartitems insert(Cartitems cartitems);

    /**
     * 修改数据
     *
     * @param cartitems 实例对象
     * @return 实例对象
     */
    Cartitems update(Cartitems cartitems);

    /**
     * 通过主键删除数据
     *
     * @param ctid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ctid);

}