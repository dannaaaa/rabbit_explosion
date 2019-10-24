package com.spartaglobal.rabbit_explosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitCreator {

    //male generator
    private List<IRabbit> maleRabbitList = new ArrayList<>();
    private RabbitGenerator rabbitGenerator = new RabbitGenerator();
    private LifeSpanManager lifeSpanManager = new LifeSpanManager();
    public void addMaleRabbit() {
        maleRabbitList.add(rabbitGenerator.createRabbit(0, false, true, lifeSpanManager.month));
    }

    public List<IRabbit> getMaleRabbitList() {
        return maleRabbitList;
    }
//
//    public void malePrintRabbit() {
//
//        System.out.println(maleRabbitList.size());
//
//        for (IRabbit rabbit : maleRabbitList) {
//            System.out.println(rabbit.getAge());
//            System.out.println(rabbit.getAlive());
//            System.out.println(rabbit.getMature());
//        }
//    }

    //female generator

//    private List<IFemaleRabbit> femaleRabbitList = new ArrayList<>();
//    public void addFemaleRabbit() {
//        femaleRabbitList.add(rabbitGenerator.createRabbit(0,false, true, lifeSpanManager.month));
//    }
//
//    public List<IFemaleRabbit> getFemaleRabbitList(){
//        return femaleRabbitList;
//    }
//
//
//    public void femalePrintRabbit() {
//
//        System.out.println(femaleRabbitList.size());
//
//        for (IRabbit rabbit : femaleRabbitList) {
//            System.out.println(rabbit.getAge());
//            System.out.println(rabbit.getAlive());
//            System.out.println(rabbit.getMature());
//
//        }
//    }

}
