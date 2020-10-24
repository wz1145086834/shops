package com.shop.entity;

import java.io.Serializable;

/**
 * (Favorite)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:07:04
 */
public class Favorite implements Serializable {
    private static final long serialVersionUID = -18803661564107708L;

    private Integer fid;

    private Integer uid;

    private Integer gid;

    private String bak01;

    private String bak02;

    private String bak03;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
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