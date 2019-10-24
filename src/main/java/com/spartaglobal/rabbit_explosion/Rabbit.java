package com.spartaglobal.rabbit_explosion;

import java.util.ArrayList;

public class Rabbit implements IRabbit {

    private boolean mature;
    private boolean alive;
    private int age;
    private int timeOfBirth;


    @Override
    public boolean getMature() {
        return this.mature;
    }

    @Override
    public void setMature(boolean mature) {
        this.mature = mature;

    }

    @Override
    public boolean getAlive() {
        return this.alive;
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;

    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public int getTimeOfBirth() {
        return timeOfBirth;
    }

    @Override
    public void setTimeOfBirth(int timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }
}
