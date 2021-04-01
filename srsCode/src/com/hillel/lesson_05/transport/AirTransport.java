package com.hillel.lesson_05.transport;

public class AirTransport extends Transport {
    private int flightLevel;

    public AirTransport(String name) {
        super(name);
    }

    public int getFlightLevel() {
        return flightLevel;
    }

    public void setFlightLevel(int flightLevel) {
        this.flightLevel = flightLevel;
    }
}
