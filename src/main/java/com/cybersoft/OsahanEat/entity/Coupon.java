package com.cybersoft.OsahanEat.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "description")
    private String desc;

    @Column(name = "discount")
    private int discount;

    @ManyToOne
    @JoinColumn(name = "cate_res_id")
    private CateRestaurant cateRestaurant;

    @OneToMany(mappedBy = "coupon")
    Set<OrderItem> orderItems;

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public CateRestaurant getCateRestaurant() {
        return cateRestaurant;
    }

    public void setCateRestaurant(CateRestaurant cateRestaurant) {
        this.cateRestaurant = cateRestaurant;
    }
}
