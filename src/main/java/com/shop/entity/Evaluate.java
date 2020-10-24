package com.shop.entity;

import java.io.Serializable;

/**
 * (Evaluate)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:07:00
 */
public class Evaluate implements Serializable {
    private static final long serialVersionUID = 153073701389596703L;

    private Integer eid;

    private Integer gid;

    private String content;

    private String bak01;

    private String bak02;

    private String bak03;


    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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