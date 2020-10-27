package com.shop.service.impl;

import com.shop.dao.CartitemsDao;
import com.shop.entity.Cartitems;
import com.shop.service.CartitemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cartitems)表服务实现类
 *
 * @author makejava
 * @since 2020-10-26 16:36:50
 */
@Service("cartitemsService")
public class CartitemsServiceImpl implements CartitemsService {
    @Resource
    private CartitemsDao cartitemsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ctid 主键
     * @return 实例对象
     */
    @Override
    public Cartitems queryById(Integer ctid) {
        return this.cartitemsDao.queryById(ctid);
    }

    @Override
    public List<Cartitems> queryByid(int id) {
        return cartitemsDao.queryByid(id);
    }

    @Override
    public Cartitems queryByCartitems(Cartitems cartitems) {
        return cartitemsDao.queryByCartitems(cartitems);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cartitems> queryAllByLimit(int offset, int limit) {
        return this.cartitemsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cartitems 实例对象
     * @return 实例对象
     */
    @Override
    public Cartitems insert(Cartitems cartitems) {
        this.cartitemsDao.insert(cartitems);
        return cartitems;
    }

    /**
     * 修改数据
     *
     * @param cartitems 实例对象
     * @return 实例对象
     */
    @Override
    public Cartitems update(Cartitems cartitems) {
        this.cartitemsDao.update(cartitems);
        return this.queryById(cartitems.getCtid());
    }

    @Override
    public int updateByIdAndGidAndCidAndSid(int counts,int id ,int gid,int cid ,int sid) {
        return cartitemsDao.updateByIdAndGidAndCidAndSid(id,gid,cid,sid,counts );
    }

    /**
     * 通过主键删除数据
     *
     * @param ctid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ctid) {
        return this.cartitemsDao.deleteById(ctid) > 0;
    }

    @Override
    public boolean deleteByid(int id) {
        return cartitemsDao.deleteByid(id)>0;
    }

    @Override
    public boolean deleteBySidAndCid(int id, int gid, int sid, int cid) {
        return cartitemsDao.deleteBySidAndCid(id,gid,sid,cid)>0;
    }
}