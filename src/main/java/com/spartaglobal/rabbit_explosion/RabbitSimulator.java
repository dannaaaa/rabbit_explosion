package com.spartaglobal.rabbit_explosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitSimulator {

    private int month = 1;
    private int year = 60;

    MaleRabbitCreator maleRabbitCreator = new MaleRabbitCreator();
    List<IRabbit> addMaleRabbit = maleRabbitCreator.getMaleRabbitList();

    FemaleRabbitCreator femaleRabbitCreator = new FemaleRabbitCreator();
    List<IRabbit> addFemaleRabbit = femaleRabbitCreator.getFemaleRabbitList();



    public int addToMaleRabbit (int addToMaleList){
        for (int i = 0; i < addMaleRabbit.size() ; i++) {
        }
        return addToMaleList;
    }


    public int addFemaleRabbit (int addToFemaleList){
        for (int i = 0; i < addFemaleRabbit.size(); i++) {
        }
        return addToFemaleList;
    }

    public void  moreRabbit(){

    }

}
