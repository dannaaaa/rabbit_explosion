package com.spartaglobal.rabbit_explosion;

import java.util.List;

public class SetMaleRabbitMaturity {

    public List<IRabbit> setMaturity (List<IRabbit> maleRabbitList){
        for (int i = 0; i < maleRabbitList.size() ; i++) {
            if(maleRabbitList.get(i).getAge() >= 3 ){
                maleRabbitList.get(i).setMature(true);
                System.out.println("Maturity is: " + maleRabbitList.get(i).getMature());
            }
        }

        return maleRabbitList;
    }


}
