package com.shop.dao;

import com.shop.entity.Attention;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Attention)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-24 15:06:30
 */
public interface AttentionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Attention queryById(Integer aid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Attention> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attention 实例对象
     * @return 对象列表
     */
    List<Attention> queryAll(Attention attention);

    /**
     * 新增数据
     *
     * @param attention 实例对象
     * @return 影响行数
     */
    int insert(Attention attention);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Attention> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Attention> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Attention> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Attention> entities);

    /**
     * 修改数据
     *
     * @param attention 实例对象
     * @return 影响行数
     */
    int update(Attention attention);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

}