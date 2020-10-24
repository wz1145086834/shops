package com.shop.service;

import com.shop.entity.Attention;

import java.util.List;

/**
 * (Attention)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:06:34
 */
public interface AttentionService {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Attention queryById(Integer aid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Attention> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param attention 实例对象
     * @return 实例对象
     */
    Attention insert(Attention attention);

    /**
     * 修改数据
     *
     * @param attention 实例对象
     * @return 实例对象
     */
    Attention update(Attention attention);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aid);

}