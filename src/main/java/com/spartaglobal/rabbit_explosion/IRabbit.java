package com.spartaglobal.rabbit_explosion;

public interface IRabbit  {

    boolean getMature();
    void setMature(boolean mature);
    boolean getAlive();
    void setAlive(boolean alive);
    int getAge();
    void setAge(int age);

    int getTimeOfBirth();
    void setTimeOfBirth(int timeOfBirth);

}
