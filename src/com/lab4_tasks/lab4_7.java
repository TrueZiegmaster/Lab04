package com.lab4_tasks;

public class lab4_7 {
    public static void get(){
        int[][] array = new int[8][8];
        int row = 0, column = 0, dx = 1, dy = 0, turns = 0, a = 8;
        for(int i = 0; i < 64; i++){
            array[row][column] = i + 1;
            if (--a == 0){
                a = 8 * (turns % 2) + 8 * ((turns + 1) % 2) - (turns / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                turns++;
            }
            column += dx;
            row += dy;
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
