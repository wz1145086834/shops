package com.shop.controller;

import com.shop.entity.Size;
import com.shop.service.SizeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Size)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:22
 */
@RestController
@RequestMapping("size")
public class SizeController {
    /**
     * 服务对象
     */
    @Resource
    private SizeService sizeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Size selectOne(Integer id) {
        return this.sizeService.queryById(id);
    }

}