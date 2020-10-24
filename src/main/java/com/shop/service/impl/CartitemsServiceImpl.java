package com.shop.service.impl;

import com.shop.entity.Cartitems;
import com.shop.dao.CartitemsDao;
import com.shop.service.CartitemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cartitems)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:06:53
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
}