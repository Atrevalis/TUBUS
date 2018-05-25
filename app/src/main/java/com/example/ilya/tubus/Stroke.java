package com.example.ilya.tubus;

public class Stroke {
    String name;
    String ready;
    String position;

    public Stroke(String name, String ready, String position) {
        this.name = name;
        this.ready = ready;
        this.position = position;
    }


    public Stroke() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReady() {
        return ready;
    }

    public String getPosition() {
        return position;
    }

}
