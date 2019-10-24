package com.spartaglobal.rabbit_explosion;

import java.util.ArrayList;
import java.util.List;

public class FemaleRabbitCreator {

    private List<IRabbit> femaleRabbitList = new ArrayList<>();
    private RabbitGenerator rabbitGenerator = new RabbitGenerator();


    //loop to increment every time a rabbit is born
    public void addRabbit() {
        femaleRabbitList.add(rabbitGenerator.createRabbit(0,false, true));
    }

    public List<IRabbit> getFemaleRabbitList(){
        return femaleRabbitList;
    }


    public void femalePrintRabbit() {

        System.out.println(femaleRabbitList.size());

        for (IRabbit rabbit : femaleRabbitList) {
            System.out.println(rabbit.getAge());
            System.out.println(rabbit.getAlive());
            System.out.println(rabbit.getMature());

        }
    }
}
