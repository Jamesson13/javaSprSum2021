package com.hillel.lesson_05.animal;

abstract public class Animal {

    private boolean dog;
    private Boolean cat;

    public void voice(){
        System.out.println("Animal voice");
    }

    public Boolean getCat() {
        return cat;
    }

    public boolean isDog() {
        return dog;
    }


}
