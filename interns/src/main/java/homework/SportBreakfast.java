package homework;
import java.util.Scanner;

public class SportBreakfast {
    private int banana;
    private int milk;
    private int icecream;
    private int egg;
    
    SportBreakfast() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введите количество ингредиентов:");
        System.out.print("Банан: ");
        this.banana = sc.nextInt();
        System.out.print("Молоко (в граммах): ");
        this.milk = sc.nextInt();
        System.out.print("Мороженое (в брекетах): ");
        this.icecream = sc.nextInt();
        System.out.print("Яйца: ");
        this.egg = sc.nextInt();
        sc.close();
    }

    private double calculateGrams() {
        double bananaGrams = banana * 80;
        double milk_gram = ((double)milk / 100) * 105;
        double icecreamGrams = icecream * 100;
        double eggGrams = egg * 70;
        
        return bananaGrams + milk_gram + icecreamGrams + eggGrams;
    }

    private double calculateKilo() {
        return calculateGrams() / 1000;
    }

    public void printInfo() {
        System.out.printf("Вес в кг: %.2f\n"
                        + "Вес в граммах: %.2f", calculateKilo(), calculateGrams());
    }
}
