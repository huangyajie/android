package com.example.mac.sendargs;

import java.io.Serializable;

/**
 * Created by Mac on 15/7/12.
 */
public class User implements Serializable {

    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public User(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
}
