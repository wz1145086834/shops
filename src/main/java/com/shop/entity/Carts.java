package com.shop.entity;

public class Carts {
    private int id;
    private int uid;
    private int num;
    private double price;
    private int ctid;
    private int counts;
    private int gid;
    private String gname;
    private double nprice;
    private int iid;
    private int sid;
    private String size;
    private int cid;
    private String color;
    private String picture;

    public Carts(int id, int uid, int num, double price, int ctid, int counts, int gid, String gname, double nprice, int iid, int sid, String size, int cid, String color, String picture) {
        this.id = id;
        this.uid = uid;
        this.num = num;
        this.price = price;
        this.ctid = ctid;
        this.counts = counts;
        this.gid = gid;
        this.gname = gname;
        this.nprice = nprice;
        this.iid = iid;
        this.sid = sid;
        this.size = size;
        this.cid = cid;
        this.color = color;
        this.picture = picture;
    }

    public Carts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCtid() {
        return ctid;
    }

    public void setCtid(int ctid) {
        this.ctid = ctid;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getNprice() {
        return nprice;
    }

    public void setNprice(double nprice) {
        this.nprice = nprice;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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
}
