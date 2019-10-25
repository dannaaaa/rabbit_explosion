package com.spartaglobal.rabbit_explosion;

public interface IFemaleRabbit extends IRabbit {

    void setIsPregnant(boolean isPregnant);
    boolean getIsPregnant();

    void setGiveBirth();
    int getGiveBirth(int giveBirth);

}
