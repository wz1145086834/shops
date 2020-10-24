package com.shop.service.impl;

import com.shop.entity.Size;
import com.shop.dao.SizeDao;
import com.shop.service.SizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Size)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:21
 */
@Service("sizeService")
public class SizeServiceImpl implements SizeService {
    @Resource
    private SizeDao sizeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Size queryById(Integer sid) {
        return this.sizeDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Size> queryAllByLimit(int offset, int limit) {
        return this.sizeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param size 实例对象
     * @return 实例对象
     */
    @Override
    public Size insert(Size size) {
        this.sizeDao.insert(size);
        return size;
    }

    /**
     * 修改数据
     *
     * @param size 实例对象
     * @return 实例对象
     */
    @Override
    public Size update(Size size) {
        this.sizeDao.update(size);
        return this.queryById(size.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.sizeDao.deleteById(sid) > 0;
    }
}