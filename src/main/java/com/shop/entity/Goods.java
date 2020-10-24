package com.shop.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:07:09
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = -51959670449546951L;

    private Integer gid;

    private Integer bid;

    private String gname;

    private Object oprice;

    private Object nprice;

    private String bak01;

    private String bak02;

    private String bak03;


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Object getOprice() {
        return oprice;
    }

    public void setOprice(Object oprice) {
        this.oprice = oprice;
    }

    public Object getNprice() {
        return nprice;
    }

    public void setNprice(Object nprice) {
        this.nprice = nprice;
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