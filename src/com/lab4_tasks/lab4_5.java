package com.lab4_tasks;
import java.util.Scanner;

public class lab4_5 {
    public static void get(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность по х: ");
        int x = in.nextInt();
        System.out.println("Введите размерность по у: ");
        int y = in.nextInt();
        int[][] array = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                array[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Матрица со случайными числами:");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспонированная матрица:");
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
