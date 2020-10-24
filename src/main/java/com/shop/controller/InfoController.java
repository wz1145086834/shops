package com.shop.controller;

import com.shop.entity.Info;
import com.shop.service.InfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Info)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:17
 */
@RestController
@RequestMapping("info")
public class InfoController {
    /**
     * 服务对象
     */
    @Resource
    private InfoService infoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Info selectOne(Integer id) {
        return this.infoService.queryById(id);
    }

}