package com.shop.entity;

import java.io.Serializable;

/**
 * (Attention)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:06:29
 */
public class Attention implements Serializable {
    private static final long serialVersionUID = 919580930606640236L;

    private Integer aid;

    private Integer gid;

    private Integer number;

    private String bak01;

    private String bak02;

    private String bak03;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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