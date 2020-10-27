package com.shop.entity;

import java.io.Serializable;

/**
 * (Color)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:06:55
 */
public class Color implements Serializable {
    private static final long serialVersionUID = -20539724520205013L;

    private Integer cid;

    private Integer iid;

    private String color;

    private String picture;

    private String bak01;

    private String bak02;

    private String bak03;

    public Color() {
    }

    public Color(Integer cid, Integer iid, String color, String picture, String bak01, String bak02, String bak03) {
        this.cid = cid;
        this.iid = iid;
        this.color = color;
        this.picture = picture;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    @Override
    public String toString() {
        return "Color{" +
                "cid=" + cid +
                ", iid=" + iid +
                ", color='" + color + '\'' +
                ", picture='" + picture + '\'' +
                ", bak01='" + bak01 + '\'' +
                ", bak02='" + bak02 + '\'' +
                ", bak03='" + bak03 + '\'' +
                '}';
    }
}