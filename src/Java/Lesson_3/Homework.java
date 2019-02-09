package Java.Lesson_3;

import java.util.Scanner;

public class Homework {

    public static void main(String args[]) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 9; // Конечное значение диапазона - "до"
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int x = a + (int) (Math.random() * b); // Генерация числа
        int y = 3;
        int z = 0;
        do {
            System.out.print("Попробуйте угадать число от 1 до 9 " + "Осталось попыток[" + y + "]:");
            number = sc.nextInt();
            if (x > number) {
                System.out.println("Загаданное число больше");
            }
            if (x < number) {
                System.out.println("Загаданное число меньше");
            }
            y--;
            if (y == 0) {
                System.out.println("Вы не угадали число! Вы проиграли!");
                break;
            }
            if (x == number) {
                System.out.println("Вы угадали число!");
                break;
            }
            System.out.println("Попробуете ещё раз? 0 - да, 1 - нет");
            z = sc.nextInt();
            if (z == 1) {
                System.out.println("Отказавшись, вы проиграли!");
                break;
            }
        } while (x != number);
    }
}
