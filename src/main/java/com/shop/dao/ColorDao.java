package com.shop.dao;

import com.shop.entity.Color;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Color)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-24 15:06:56
 */
public interface ColorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Color queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Color> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param color 实例对象
     * @return 对象列表
     */
    List<Color> queryAll(Color color);

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 影响行数
     */
    int insert(Color color);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Color> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Color> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Color> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Color> entities);

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 影响行数
     */
    int update(Color color);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

}