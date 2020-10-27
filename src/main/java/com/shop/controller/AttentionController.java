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
    /*
     * 添加关注
     * */
    @PostMapping("insert")
    public boolean insert(Attention a){
        attentionService.insert(a);
        return true;
    }
    /*
     * 取关
     * */
    @GetMapping("delect/{aid}")
    public boolean delect(@PathVariable("aid") Integer aid){
        return attentionService.deleteById(aid);
    }
}