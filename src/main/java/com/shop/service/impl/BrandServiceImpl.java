package com.shop.service.impl;

import com.shop.entity.Brand;
import com.shop.dao.BrandDao;
import com.shop.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Brand)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:06:42
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;

    @Override
    public List<Brand> queryAll(Brand brand) {
        return this.brandDao.queryAll(brand);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Integer bid) {
        return this.brandDao.queryById(bid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Brand> queryAllByLimit(int offset, int limit) {
        return this.brandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getBid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bid) {
        return this.brandDao.deleteById(bid) > 0;
    }
}