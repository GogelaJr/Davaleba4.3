package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A {
    int a;
    int b;

    public void one(){
        System.out.println("A1 ----------------");
        a = rand(1,100);
        b = rand(100,200);
        int o = b;
        List<Integer> li = new ArrayList();
        for(int i = a; i<b; i++){
            li.add(i);
            System.out.println(i);


        }


    }
    public void two(){
        System.out.println("A2 ----------------");
        for(int i = 1; i <=a; i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }

    public int rand(int mi,int ma){
        return (int)((Math.random()*(ma-mi))+mi);
    }
}
