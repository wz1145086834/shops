package com.shop.service;

import com.shop.entity.Info;

import java.util.List;

/**
 * (Info)表服务接口
 *
 * @author makejava
 * @since 2020-10-24 15:07:16
 */
public interface InfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param iid 主键
     * @return 实例对象
     */
    Info queryById(Integer iid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Info> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    Info insert(Info info);

    /**
     * 修改数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    Info update(Info info);

    /**
     * 通过主键删除数据
     *
     * @param iid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer iid);

}