package com.shop.service.impl;

import com.shop.entity.Info;
import com.shop.dao.InfoDao;
import com.shop.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Info)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:17
 */
@Service("infoService")
public class InfoServiceImpl implements InfoService {
    @Resource
    private InfoDao infoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param iid 主键
     * @return 实例对象
     */
    @Override
    public Info queryById(Integer iid) {
        return this.infoDao.queryById(iid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Info> queryAllByLimit(int offset, int limit) {
        return this.infoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    @Override
    public Info insert(Info info) {
        this.infoDao.insert(info);
        return info;
    }

    /**
     * 修改数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    @Override
    public Info update(Info info) {
        this.infoDao.update(info);
        return this.queryById(info.getIid());
    }

    /**
     * 通过主键删除数据
     *
     * @param iid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer iid) {
        return this.infoDao.deleteById(iid) > 0;
    }
}