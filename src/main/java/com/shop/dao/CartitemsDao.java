package com.shop.dao;

import com.shop.entity.Cartitems;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cartitems)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-26 16:36:50
 */
public interface CartitemsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ctid 主键
     * @return 实例对象
     */
    Cartitems queryById(Integer ctid);

    List<Cartitems> queryByid(int id);

    Cartitems queryByCartitems(Cartitems cartitems);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cartitems> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cartitems 实例对象
     * @return 对象列表
     */
    List<Cartitems> queryAll(Cartitems cartitems);

    /**
     * 新增数据
     *
     * @param cartitems 实例对象
     * @return 影响行数
     */
    int insert(Cartitems cartitems);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cartitems> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Cartitems> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cartitems> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Cartitems> entities);

    /**
     * 修改数据
     *
     * @param cartitems 实例对象
     * @return 影响行数
     */
    int update(Cartitems cartitems);

    int updateByIdAndGidAndCidAndSid(int counts,int id ,int gid,int cid ,int sid);

    /**
     * 通过主键删除数据
     *
     * @param ctid 主键
     * @return 影响行数
     */
    int deleteById(Integer ctid);

    int deleteByid(int id);

    int deleteBySidAndCid(@Param("id") int id,@Param("gid") int gid,@Param("sid") int sid,@Param("cid") int cid);

}