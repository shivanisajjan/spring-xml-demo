package com.stackroute.domain;

public class Actor {
    String name;
    Integer age;
    String gender;
    public Actor(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Actor Details");
        System.out.println("Name:"+this.name);
        System.out.println("Gender:"+this.gender);
        System.out.println("Age:"+this.age);
    }
}
