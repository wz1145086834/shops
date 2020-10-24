package com.shop.service;

import com.shop.entity.Color;

import java.util.List;

/**
 * (Color)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:06:57
 */
public interface ColorService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Color queryById(Integer cid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Color> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color insert(Color color);

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color update(Color color);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}