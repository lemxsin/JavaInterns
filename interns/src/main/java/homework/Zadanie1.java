package com.examp;
import java.lang.reflect.Field;
import java.util.Random;

public class Zadanie1 {
    protected Random random;
    protected int number;
    protected byte byteNumber;
    protected short shortNumber;
    protected long longNumber;
    protected float floatNumber;
    protected double doubleNumber;
    protected char c;
    protected boolean bool;

    public Zadanie1() {
        random = new Random();
        number = random.nextInt();
        byteNumber = (byte) random.nextInt(-128, 127);
        shortNumber = (short) random.nextInt(-32768, 32767);
        longNumber = random.nextLong();
        floatNumber = random.nextFloat();
        doubleNumber = random.nextDouble();
        c = (char) (random.nextInt(26) + 'a');
        bool = random.nextBoolean();
    }

    public void printInfo() {
        Class<?> clazz = this.getClass();
        Class<?> superclass = clazz.getSuperclass();
        if (superclass instanceof Class) {
            superclass = Zadanie1.class;
        }
        Field[] fields = superclass.getDeclaredFields();

        System.out.println("Информация о полях класса: " + clazz.getName());
        System.out.println("----------------------------------");

        for(Field field : fields) {
            try {
                if (field.getName() == "random") continue;
                field.setAccessible(true);

                String name = field.getName();
                Class<?> type = field.getType();
                Object value = field.get(this);

                System.out.printf("Поле: %s | Тип: %s | Значение: %s%n",
                        name, type.getName(), value);
            }
            catch (IllegalAccessException e) {
                System.err.println("Ошибка доступа к полю " + field.getName() + ": " + e.getMessage());
            }
        }
    }
}
