package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("user")
public class UserDTO {

    private long id;


    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
