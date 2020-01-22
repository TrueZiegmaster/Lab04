package com.lab4_tasks;
import java.io.StringWriter;
import java.util.Scanner;

public class lab4_8 {
    public static void get(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        StringWriter sw = new StringWriter();
        for(int i = 0; i < text.length(); i ++){
            char x = text.charAt(i);
            if ((int)x >= 1040 && (int)x <= 1103)
                sw.append((char)(x + key));
            else
                sw.append(x);
        }
        text = sw.toString();
        System.out.println("Текст после преобразования:\n" + text);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();
        while (!(answer.matches("y") || answer.matches("n"))){
                System.out.println("Введите корректный ответ");
                answer = in.nextLine();
        }
        sw = new StringWriter();
        if (answer.matches("y")){
            for(int i = 0; i < text.length(); i ++){
                char x = text.charAt(i);
                if ((int)x >= 1040 && (int)x <= 1103)
                    sw.append((char)(x - key));
                else
                    sw.append(x);
            }
            System.out.println("Текст после преобразования:\n" + sw.toString());
        }
        else
            System.out.println("До свидания!");
    }
}
