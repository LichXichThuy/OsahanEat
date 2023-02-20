package com.cybersoft.OsahanEat.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @OneToMany(mappedBy = "category")
    Set<CateRestaurant> cateRestaurants;

    @OneToMany(mappedBy = "category")
    Set<Food> foods;

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

    public Set<CateRestaurant> getCateRestaurants() {
        return cateRestaurants;
    }

    public void setCateRestaurants(Set<CateRestaurant> cateRestaurants) {
        this.cateRestaurants = cateRestaurants;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
