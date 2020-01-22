package com.lab4_tasks;

public class lab4_6 {
    public static void get(){
        int[][] array = new int[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                array[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Матрица со случайными числами:");
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int iX = ((int)(Math.random() * 8));
        int jY = ((int)(Math.random() * 8));
        int[][] newArray = new int[7][7];
        for(int i = 0, l = 0; l < 7;){
            if(i != iX-1){
                for(int j = 0, k = 0; k < 7; j++, k++){
                    if (j == jY-1)
                        j++;
                    newArray[l][k] = array[i][j];
                }
                l++;
            }
            i++;
        }
        array = newArray;
        System.out.printf("Новая матрица, удалена строка %d и столбец %d:\n", iX, jY);
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
