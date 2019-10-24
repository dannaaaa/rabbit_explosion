package com.spartaglobal.rabbit_explosion;

public class RabbitGenerator {



    public Rabbit createRabbit(int age, boolean mature, boolean alive, int timeOfBirth){
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(age);
        rabbit.setMature(mature);
        rabbit.setAlive(alive);
        rabbit.setTimeOfBirth(timeOfBirth);


        return rabbit;
    }

}
