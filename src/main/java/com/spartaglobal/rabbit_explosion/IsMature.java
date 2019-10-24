package com.spartaglobal.rabbit_explosion;

import java.util.List;

public class IsMature {

    private int age;

    //look through the list to check if the rabbit is more than three
    //List<IRabbit> mature(List<IRabbit>)

    public boolean mature() {
        if(age >= 3 ){
            return true;
        }
        return false;
    }
}
