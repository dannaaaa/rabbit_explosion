package com.spartaglobal.rabbit_explosion;

import java.util.List;

public class SetRabbitAge {

    public List<IRabbit> addMaleAge(List<IRabbit> maleRabbitList, int time){
        for (int i = 0; i < maleRabbitList.size() ; i++) {
            int timeOfBirth = maleRabbitList.get(i).getTimeOfBirth();
            maleRabbitList.get(i).setAge(time-timeOfBirth);
            System.out.println("Age of rabbit: " + maleRabbitList.get(i).getAge());
        }
        return maleRabbitList;
    }





}
