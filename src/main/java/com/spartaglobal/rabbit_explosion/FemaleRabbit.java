package com.spartaglobal.rabbit_explosion;

import java.util.Timer;

public class FemaleRabbit extends Rabbit implements IFemaleRabbit {

    private boolean pregnant;
    private int timeOfBirth;
    private boolean mature;
    private boolean alive;
    private int age;
    private int giveBirth;


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




    @Override
    public void setIsPregnant(boolean isPregnant) {
        this.pregnant = pregnant;

    }

    @Override
    public boolean getIsPregnant() {
        return pregnant;
    }

    @Override
    public void setGiveBirth() {
        this.giveBirth = giveBirth;

    }

    @Override
    public int getGiveBirth(int giveBirth)
    {
        return this.giveBirth;
    }

    }

