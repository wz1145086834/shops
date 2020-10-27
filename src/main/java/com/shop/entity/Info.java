package com.shop.entity;

import java.io.Serializable;

/**
 * (Info)实体类
 *
 * @author makejava
 * @since 2020-10-24 15:07:14
 */
public class Info implements Serializable {
    private static final long serialVersionUID = -13730053749500070L;

    private Integer iid;

    private Integer gid;

    private String texture;

    private String model;

    private String bak01;

    private String bak02;

    private String bak03;

    private Size size;

    private Color color;

    public Size getSize() {
        return size;
    }



    public Info() {
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "Info{" +
                "iid=" + iid +
                ", gid=" + gid +
                ", texture='" + texture + '\'' +
                ", model='" + model + '\'' +
                ", bak01='" + bak01 + '\'' +
                ", bak02='" + bak02 + '\'' +
                ", bak03='" + bak03 + '\'' +
                ", size=" + size +
                ", color=" + color +
                '}';
    }
}