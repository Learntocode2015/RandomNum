package com.company.RandomNum;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(randomNum());
    }
    public static int randomNum() {
       Random rand = new Random();
       return rand.nextInt(100);
    }


}


