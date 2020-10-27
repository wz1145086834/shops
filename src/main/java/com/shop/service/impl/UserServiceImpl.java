package com.shop.service.impl;

import com.shop.entity.User;
import com.shop.dao.UserDao;
import com.shop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 15:07:41
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tel 主键
     * @return 实例对象
     */

    public User queryByTel(String tel) {
        return this.userDao.queryByTel(tel);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */

    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */

    public User update(User user) {
        this.userDao.update(user);
        return this.queryByTel(user.getTel());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */

    public boolean deleteById(Integer uid) {

        return this.userDao.deleteById(uid) > 0;
    }
    public List<User> getAllUser() {
        return this.userDao.getAllUser();
    }
}