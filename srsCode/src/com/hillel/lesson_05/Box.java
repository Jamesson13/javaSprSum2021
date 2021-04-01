package com.hillel.lesson_05;

public class Box {
    private Double w;
    private Double h;
    private Double d;

    public Box(Double w, Double h, Double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public void setD(Double d) {
        this.d = d;
    }

//    @Override
//    public String toString() {
//        return "Box{" +
//                "w=" + w +
//                ", h=" + h +
//                ", d=" + d +
//                '}';
//    }
}
