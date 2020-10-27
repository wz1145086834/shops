package com.shop.entity;

import java.io.Serializable;

/**
 * (Size)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:07:19
 */
public class Size implements Serializable {
    private static final long serialVersionUID = 749689148119490517L;

    private Integer sid;

    private Integer iid;

    private Integer size;

    private String bak01;

    private String bak02;

    private String bak03;

    public Size() {
    }

    public Size(Integer sid, Integer iid, Integer size, String bak01, String bak02, String bak03) {
        this.sid = sid;
        this.iid = iid;
        this.size = size;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sid=" + sid +
                ", iid=" + iid +
                ", size=" + size +
                ", bak01='" + bak01 + '\'' +
                ", bak02='" + bak02 + '\'' +
                ", bak03='" + bak03 + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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