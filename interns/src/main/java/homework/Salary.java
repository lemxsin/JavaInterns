package homework;
import java.util.Scanner;

public class Salary {
    private int salary[] = new int[3];
    private double salaryNew[] = new double[3];
    private String names[] = new String[] {"Маша", "Денис", "Кристина"};

    Salary() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Введите зарплату для сотрудника(цы) %s: ", names[i]);
            while (true){
                try { salary[i] = sc.nextInt(); break;}
            catch (NumberFormatException e){
                System.out.println("Ошибка: введите число!");
                }
            }
        }
        sc.close();
        calculateIncreaseSalary();
    }

    private void calculateIncreaseSalary() {
        for (int i = 0; i < salaryNew.length; i++) {
            salaryNew[i] = salary[i] * 1.1;
        }
    }

    public void printInfo() {
        for (int i = 0; i < salaryNew.length; i++) {
            System.out.printf("%s теперь получает %.1f рублей."
                            + " Годовой доход вырос на %.1f рублей\n", 
                            names[i], salaryNew[i] ,salaryNew[i] - salary[i]);
        }
    }

}
