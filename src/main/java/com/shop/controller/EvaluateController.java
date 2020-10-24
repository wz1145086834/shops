package com.shop.controller;

import com.shop.entity.Evaluate;
import com.shop.service.EvaluateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Evaluate)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:03
 */
@RestController
@RequestMapping("evaluate")
public class EvaluateController {
    /**
     * 服务对象
     */
    @Resource
    private EvaluateService evaluateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Evaluate selectOne(Integer id) {
        return this.evaluateService.queryById(id);
    }

}