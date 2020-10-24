package com.shop.entity;

import java.io.Serializable;

/**
 * (Cartitems)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:06:51
 */
public class Cartitems implements Serializable {
    private static final long serialVersionUID = -47522198919937769L;

    private Integer ctid;

    private Integer id;

    private Integer gid;

    private Integer counts;

    private String bak01;

    private String bak02;

    private String bak03;


    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public String getBak01() {
        return bak01;
    }

    public void setBak01(String bak01) {
        this.bak01 = bak01;
    }

    public String getBak02() {
        return bak02;
    }

    public void setBak02(String bak02) {
        this.bak02 = bak02;
    }

    public String getBak03() {
        return bak03;
    }

    public void setBak03(String bak03) {
        this.bak03 = bak03;
    }

}