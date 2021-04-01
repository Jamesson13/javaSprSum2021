package com.hillel.lesson_05.transport;

public class Ship extends WaterTransport {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ship(String name) {
        super(name);
    }
}
