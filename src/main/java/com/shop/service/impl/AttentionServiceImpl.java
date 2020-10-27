package com.shop.service.impl;

import com.shop.entity.Attention;
import com.shop.dao.AttentionDao;
import com.shop.service.AttentionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Attention)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:06:36
 */
@Service("attentionService")
public class AttentionServiceImpl implements AttentionService {
    @Resource
    private AttentionDao attentionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */

    public Attention queryById(Integer aid) {
        return this.attentionDao.queryById(aid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    public List<Attention> queryAllByLimit(int offset, int limit) {
        return this.attentionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param attention 实例对象
     * @return 实例对象
     */

    public Attention insert(Attention attention) {
        this.attentionDao.insert(attention);
        return attention;
    }

    /**
     * 修改数据
     *
     * @param attention 实例对象
     * @return 实例对象
     */

    public Attention update(Attention attention) {
        this.attentionDao.update(attention);
        return this.queryById(attention.getAid());
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */

    public boolean deleteById(Integer aid) {
        return this.attentionDao.deleteById(aid) > 0;
    }
}