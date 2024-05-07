package com.myblog.myblog2;

import lombok.Data;

@Data
public class Login {

    private String name;
    private String city;

    public Login(String name,String city){
        this.name=name;
        this.city=city;
    }
}
