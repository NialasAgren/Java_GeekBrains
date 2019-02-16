package Java.Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticTool {
    public static void main(String[] args) {
        //Тернарный оператор
        int a = 15;
        System.out.println("Переменная a " + (a > 10 ? "больше 10" : "меньше 10"));
        string();
    }

    public static void newScanner(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String string = scanner.nextLine();
        String word = scanner.next();

        System.out.println("Ввведено число:" + number);
        System.out.println("Ввведена строка:" + string);
        System.out.println("Ввведено слово:" + word);

        scanner.close(); //Лучше закрывать после использования.
    }

     static void randomInt(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void string() {

    }


}
