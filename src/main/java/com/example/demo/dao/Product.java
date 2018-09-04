package com.example.demo.dao;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "price")
    public Long price;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH},targetEntity = User.class)
    private User user;


}
