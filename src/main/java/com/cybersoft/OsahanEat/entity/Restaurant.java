package com.cybersoft.OsahanEat.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "description")
    private String desc;

    @Column(name = "rating")
    private int rating;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "restaurant")
    Set<RatingRestaurant> rating_res;

    @OneToMany(mappedBy = "category")
    Set<CateRestaurant> cateRestaurants;

    public Set<CateRestaurant> getCateRestaurants() {
        return cateRestaurants;
    }

    public void setCateRestaurants(Set<CateRestaurant> cateRestaurants) {
        this.cateRestaurants = cateRestaurants;
    }

    public Set<RatingRestaurant> getRating_res() {
        return rating_res;
    }

    public void setRating_res(Set<RatingRestaurant> rating_res) {
        this.rating_res = rating_res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
