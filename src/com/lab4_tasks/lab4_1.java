package com.lab4_tasks;

public class lab4_1 {
    public static void get(){
        for(int i = 0; i < 11; i++){
            if(i == 0 || i == 10){
                for (int j = 0; j < 23; j++){
                    System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < 23; j++){
                    if (j == 0 || j == 22)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
