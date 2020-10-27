package com.shop.entity;

import java.io.Serializable;

/**
 * (Cart)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:06:45
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = -51475378981743145L;

    private Integer id;

    private Integer uid;

    private Integer num;

    private Object price;

    private String bak01;

    private String bak02;

    private String bak03;

    private Cartitems cartitems;

    public Cart(Integer id, Integer uid, Integer num, Object price, String bak01, String bak02, String bak03, Cartitems cartitems) {
        this.id = id;
        this.uid = uid;
        this.num = num;
        this.price = price;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
        this.cartitems = cartitems;
    }

    public Cartitems getCartitems() {
        return cartitems;
    }

    public void setCartitems(Cartitems cartitems) {
        this.cartitems = cartitems;
    }

    public Cart() {
    }

    public Cart( Integer uid, Integer num, Object price, String bak01, String bak02, String bak03) {
        this.uid = uid;
        this.num = num;
        this.price = price;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }

    public Cart(Integer id, Integer uid, Integer num, Object price, String bak01, String bak02, String bak03) {
        this.id = id;
        this.uid = uid;
        this.num = num;
        this.price = price;
        this.bak01 = bak01;
        this.bak02 = bak02;
        this.bak03 = bak03;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
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