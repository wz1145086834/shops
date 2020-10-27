package com.shop.service.impl;

import com.shop.dao.GuanzhuDao;
import com.shop.entity.Guanzhu;
import com.shop.service.GuanzhuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("guanzhuService")
public class GuanzhuServiceImpl implements GuanzhuService {
    @Resource
    private GuanzhuDao userAttention;

    public List<Guanzhu> getUserAttentionGoods(Integer gid) {
        return userAttention.getUserAttentionGoods(gid);
    }
}
