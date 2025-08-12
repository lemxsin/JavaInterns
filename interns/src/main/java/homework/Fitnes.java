package com.examp;
import java.util.Scanner;

public class Fitnes {
    private double weight;
    private double weightGrams;

    Fitnes() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Введите вес (в кг): ");

        while (true){
            try {
                this.weight = Double.parseDouble(sc.nextLine());
                this.weightGrams = weight * 1000;
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: введите число!");   
            }
        }
        sc.close();
    }

    private double calculateQuarterCalories() {
        return weightGrams / 250;
    }

    private double calculateHalfCalories() {
        return weightGrams / 500;
    }

    private double calculateAvrDays() {
        return (int)(calculateHalfCalories() + calculateQuarterCalories()) / 2;
    }

    public void printInfo() {
        System.out.printf("250 грамм за %.0f дня(ей)\n" + 
                        "500 грамм за %.0f дня(ей)\n" +
                        "Среднее кол-во дней: %.0f",
                        calculateQuarterCalories(), calculateHalfCalories(), calculateAvrDays());
    }
}
