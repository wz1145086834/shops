package com.shop.controller;

import com.shop.entity.Brand;
import com.shop.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Brand)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:06:43
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Brand selectOne(Integer id) {
        return this.brandService.queryById(id);
    }

    @GetMapping("selectAll/{tid}")
    public List<Brand> selectAll(Brand brand){
        return this.brandService.queryAll(brand);
    }

}