package com.spartaglobal.rabbit_explosion;

public class MaleRabbit implements IRabbit  {

    private boolean mature;
    private boolean alive;
    private int age;

    @Override
    public boolean getMature() {
        return mature;
    }

    @Override
    public void setMature(boolean mature) {
        this.mature = mature;

    }

    @Override
    public boolean getAlive() {
        return alive;
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
}
