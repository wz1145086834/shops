package com.shop.service.impl;

import com.shop.entity.Type;
import com.shop.dao.TypeDao;
import com.shop.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:26
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;

    public List<Type> queryAll() {
        return typeDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Type queryById(Integer tid) {
        return this.typeDao.queryById(tid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Type> queryAllByLimit(int offset, int limit) {
        return this.typeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type insert(Type type) {
        this.typeDao.insert(type);
        return type;
    }

    /**
     * 修改数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type update(Type type) {
        this.typeDao.update(type);
        return this.queryById(type.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tid) {
        return this.typeDao.deleteById(tid) > 0;
    }
}