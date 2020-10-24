package com.shop.controller;

import com.shop.entity.Attention;
import com.shop.service.AttentionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Attention)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:36
 */
@RestController
@RequestMapping("attention")
public class AttentionController {
    /**
     * 服务对象
     */
    @Resource
    private AttentionService attentionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Attention selectOne(Integer id) {
        return this.attentionService.queryById(id);
    }

}