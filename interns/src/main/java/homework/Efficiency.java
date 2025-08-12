package com.examp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Efficiency {
    private int value;
    private String time;
    private final Scanner sc;
    private static final int DIV_MIN = 8;
    private Boolean check = false;
    private double result;

    Efficiency() {
        this.sc = new Scanner(System.in, "UTF-8");
    }

    private void findTime() {
        while (!check){
            System.out.print("Ищем производительность по минутам/часам/суткам? (введите m/h/d): ");
            time = sc.nextLine().trim();

            if ("m".equals(time) || "h".equals(time) || "d".equals(time)) {
            check = true;  // Устанавливаем true при правильном вводе
            } else {
            System.out.println("Неверный ввод!");
            }
        }
        
    }

    private double calculateEfficiency() {
        findTime();
        while (check){
            System.out.print("Введите число: ");
            try {
                this.value = sc.nextInt();
                check = false;
            } catch (InputMismatchException e){
                System.out.println("Ошибка: введите число!");
            }
        }
        


        if (time.startsWith("m")){
            result = Math.floor(value / DIV_MIN);
        }
        else if (time.startsWith("h")){
            result = Math.floor(value * 60 / DIV_MIN);
        }
        else if (time.startsWith("d")){
            result = Math.floor(value * 60 * 24 / DIV_MIN);
        }
        else{
            System.out.println("Неверный ввод!");
        }
        sc.close();
        return (int)result;
    }

    public void printInfo() {
        System.out.printf("Производительность с учетом выбранного времени: %.2f", calculateEfficiency());
    }
}
