package com.lab4_tasks;

public class lab4_3 {
    public static void get(){
        int[][] array = new int[8][8];
        for (int i = 0; i < 8; i++){
            array[0][i] = 2;
            array[7][i] = 2;
        }
        for(int i = 1; i < 7; i++){
            array[i][0] = 2;
            array[i][7] = 2;
        }
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
