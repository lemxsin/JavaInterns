package homework;

/**
 * Тип  Размер  Пример  Описание
byte  1 байт  byte a = 100;  Целое число (-128..127)
short  2 байта  short b = 30_000;  Целое число (-32k..32k)
int  4 байта  int c = 2_000_000;  Основной тип для чисел
long  8 байта  long d = 5L;  Большие числа (L в конце)
float  4 байта  float e = 3.14f;  Дробное (f в конце)
double  8 байта  double f = 5.5;  Основной тип для дробных
char  2 байта  char g = 'A';  Символ Unicode
boolean  1 бит  boolean h = true;  true / false

 */

public class Zadanie2 extends Zadanie1 {
    public Zadanie2() {
        this.doubleNumber = 27.12;
        this.longNumber = 987678965549L;
        this.floatNumber = 2.786f;
        this.shortNumber = 569;
        this.number = 27897;
        this.byteNumber = 67;
        this.c = 569;
    }
}
