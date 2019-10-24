package com.spartaglobal.rabbit_explosion;

import java.util.Timer;

public class FemaleRabbit extends Rabbit implements IFemaleRabbit {

    private boolean pregnant;
    private int timeOfBirth;


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

    }

    @Override
    public int getGiveBirth(int giveBirth) {
        return 0;
    }

    @Override
    public int getTimeOfBirth() {
        return this.timeOfBirth;
    }

    @Override
    public void setTimeOfBirth(int timeOfBirth) {
        this.timeOfBirth = timeOfBirth;

    }
}

