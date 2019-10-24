package com.spartaglobal.rabbit_explosion;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {


        MaleRabbitCreator maleRabbitCreator = new MaleRabbitCreator();
        maleRabbitCreator.addRabbit();
        maleRabbitCreator.malePrintRabbit();

        FemaleRabbitCreator femaleRabbit = new FemaleRabbitCreator();
        femaleRabbit.addRabbit();
        femaleRabbit.femalePrintRabbit();

        RabbitSimulator rabbitSimulator = new RabbitSimulator();


    }
}
