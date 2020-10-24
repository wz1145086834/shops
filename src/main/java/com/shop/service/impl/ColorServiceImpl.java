package com.shop.service.impl;

import com.shop.entity.Color;
import com.shop.dao.ColorDao;
import com.shop.service.ColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Color)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:06:58
 */
@Service("colorService")
public class ColorServiceImpl implements ColorService {
    @Resource
    private ColorDao colorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Color queryById(Integer cid) {
        return this.colorDao.queryById(cid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Color> queryAllByLimit(int offset, int limit) {
        return this.colorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color insert(Color color) {
        this.colorDao.insert(color);
        return color;
    }

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color update(Color color) {
        this.colorDao.update(color);
        return this.queryById(color.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.colorDao.deleteById(cid) > 0;
    }
}