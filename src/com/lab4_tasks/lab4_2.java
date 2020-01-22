package com.lab4_tasks;

public class lab4_2{
    public static void get(){
        System.out.print("*\n");
        for(int i = 0; i < 10; i++){
            if (i < 9) {
                System.out.print("*");
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.print("*\n");
            }
            else
                for (int j = 0; j < i -3; j++)
                    System.out.print("* ");
        }
    }
}
