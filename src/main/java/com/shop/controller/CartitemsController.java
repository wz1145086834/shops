package com.shop.controller;

import com.shop.entity.Cartitems;
import com.shop.service.CartitemsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cartitems)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:54
 */
@RestController
@RequestMapping("cartitems")
public class CartitemsController {
    /**
     * 服务对象
     */
    @Resource
    private CartitemsService cartitemsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cartitems selectOne(Integer id) {
        return this.cartitemsService.queryById(id);
    }

}