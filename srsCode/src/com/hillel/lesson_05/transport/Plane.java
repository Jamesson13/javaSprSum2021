package com.hillel.lesson_05.transport;

public class Plane extends AirTransport{
    private String model;

    public Plane(String name) {
        super(name);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
