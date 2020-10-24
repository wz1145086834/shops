package com.shop.controller;

import com.shop.entity.Color;
import com.shop.service.ColorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Color)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:58
 */
@RestController
@RequestMapping("color")
public class ColorController {
    /**
     * 服务对象
     */
    @Resource
    private ColorService colorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Color selectOne(Integer id) {
        return this.colorService.queryById(id);
    }

}