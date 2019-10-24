package com.spartaglobal.rabbit_explosion;

import java.util.List;

public class LifeSpanManager {


    //private int age;
    public int year = 60;
    public int month = 1;
    //List<IFemaleRabbit> femaleRabbitList = rabbitCreator.getFemaleRabbitList();
    SetRabbitAge setRabbitAge = new SetRabbitAge();

    public void Life(){
        RabbitCreator rabbitCreator = new RabbitCreator();
        SetMaleRabbitMaturity setMaleRabbitMaturity = new SetMaleRabbitMaturity();

        List<IRabbit> maleRabbitList = rabbitCreator.getMaleRabbitList();

        rabbitCreator.addMaleRabbit();
        while(month < year ){
            setRabbitAge.addMaleAge(maleRabbitList,month); // ALWAYS PASS THE LIST
            setMaleRabbitMaturity.setMaturity(maleRabbitList);

            System.out.println(month);


            month++;


        }





    }
}
