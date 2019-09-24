package com.stackroute.domain;

public class Movie {
    Actor actor;
    public Movie(){

    }
    public Movie(Actor actor1) {
        this.actor = actor1;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor(){
        return this.actor;
    }
}
