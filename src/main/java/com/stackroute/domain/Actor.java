package com.stackroute.domain;

public class Actor {
    String name;
    Integer age;
    String gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void display(){
        System.out.println("Actor Details");
        System.out.println("Name:"+this.name);
        System.out.println("Gender:"+this.gender);
        System.out.println("Age:"+this.age);
    }
}
