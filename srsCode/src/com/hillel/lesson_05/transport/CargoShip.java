package com.hillel.lesson_05.transport;

public class CargoShip extends Ship {

    private Integer deadweight;

    public Integer getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(Integer deadweight) {
        this.deadweight = deadweight;
    }

    public CargoShip(String name) {
        super(name);
    }
}
