package com.shop.dao;

import com.shop.entity.Size;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Size)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-24 15:07:20
 */
public interface SizeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Size queryById(Integer sid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Size> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param size 实例对象
     * @return 对象列表
     */
    List<Size> queryAll(Size size);

    /**
     * 新增数据
     *
     * @param size 实例对象
     * @return 影响行数
     */
    int insert(Size size);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Size> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Size> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Size> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Size> entities);

    /**
     * 修改数据
     *
     * @param size 实例对象
     * @return 影响行数
     */
    int update(Size size);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(Integer sid);

}