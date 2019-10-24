package com.spartaglobal.rabbit_explosion;

import java.util.ArrayList;
import java.util.List;

public class MaleRabbitCreator {

    private List<IRabbit> maleRabbitList = new ArrayList<>();
    private RabbitGenerator rabbitGenerator = new RabbitGenerator();


    public void addRabbit(){
        maleRabbitList.add(rabbitGenerator.createRabbit(0, false, true));
    }

    public List<IRabbit> getMaleRabbitList(){
        return maleRabbitList;
    }




    public void malePrintRabbit(){

        System.out.println(maleRabbitList.size());

        for(IRabbit rabbit: maleRabbitList){
            System.out.println(rabbit.getAge());
            System.out.println(rabbit.getAlive());
            System.out.println(rabbit.getMature());

        }
    }




}
