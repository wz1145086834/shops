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

    private double oprice;

    private double nprice;

    private String bak01;

    private String bak02;

    private String bak03;

    private Info info;

    public Goods() {
    }

    public Goods(Integer gid, Integer bid, String gname, double oprice, double nprice, String bak01, String bak02, String bak03, Info info) {
        this.gid = gid;
        this.bid = bid;
        this.gname = gname;
        this.oprice = oprice;
        this.nprice = nprice;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
        this.info = info;
    }


    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

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

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public double getOprice() {
        return oprice;
    }

    public double getNprice() {
        return nprice;
    }

    public void setNprice(double nprice) {
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

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", bid=" + bid +
                ", gname='" + gname + '\'' +
                ", oprice=" + oprice +
                ", nprice=" + nprice +
                ", bak01='" + bak01 + '\'' +
                ", bak02='" + bak02 + '\'' +
                ", bak03='" + bak03 + '\'' +
                ", info=" + info +
                '}';
    }
}