package com.shop.entity;

import java.io.Serializable;

/**
 * (Cartitems)实体类
 *
 * @author makejava
 * @since 2020-10-26 16:36:50
 */
public class Cartitems implements Serializable {
    private static final long serialVersionUID = 873971824035037651L;

    private Integer ctid;

    private Integer id;

    private Integer gid;

    private Integer sid;

    private Integer cid;

    private Integer counts;

    private String bak01;

    private String bak02;

    private String bak03;

    private Goods goods;

    public Cartitems(Integer id, Integer gid, Integer sid, Integer cid) {
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.cid = cid;
    }

    public Cartitems(Integer ctid, Integer id, Integer gid, Integer sid, Integer cid, Integer counts, String bak01, String bak02, String bak03) {
        this.ctid = ctid;
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.cid = cid;
        this.counts = counts;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }

    public Cartitems(Integer id, Integer gid, Integer sid, Integer cid, Integer counts, String bak01, String bak02, String bak03, Goods goods) {
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.cid = cid;
        this.counts = counts;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
        this.goods = goods;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Cartitems() {
    }

    public Cartitems(Integer id, Integer gid, Integer sid, Integer cid, Integer counts, String bak01, String bak02, String bak03) {
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.cid = cid;
        this.counts = counts;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }

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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    @Override
    public String toString() {
        return "Cartitems{" +
                "ctid=" + ctid +
                ", id=" + id +
                ", gid=" + gid +
                ", sid=" + sid +
                ", cid=" + cid +
                ", counts=" + counts +
                ", bak01='" + bak01 + '\'' +
                ", bak02='" + bak02 + '\'' +
                ", bak03='" + bak03 + '\'' +
                ", goods=" + goods +
                '}';
    }
}