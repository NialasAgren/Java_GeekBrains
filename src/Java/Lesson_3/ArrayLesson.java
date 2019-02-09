package Java.Lesson_3;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        System.out.println("Задание #1");
        //------------------Задание #1------------------//
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1};
        int j = arr.length;
        for (int i = 0; i < j; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < j; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Задание #2");
        //------------------Задание #2------------------//
        int[] array = new int[8];
        int k = 0;
        int fill = array.length;

        for (int i = 0; i < fill; ++i, k = k + 3) {
            array[i] = k;
            System.out.print(+array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Задание #3");
        //------------------Задание #3------------------//
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        String intArrayString = Arrays.toString(task3);
        System.out.print(intArrayString);
        int task3_1 = task3.length;
        for (int i = 0; i < task3_1; i++)
            if (task3[i] < 6) task3[i] = task3[i] * 2;
        System.out.println(" ");
        System.out.print("[");
        for (int i = 0; i < task3_1; i++) {
            System.out.print(+task3[i] + ", ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println("Задание #5");
        //------------------Задание #5------------------//
        int[] arrayMix = {78, 15, 50, 43, 38, 72};
        int arrayMix1 = arrayMix.length;
        int min = 100;
        int max = 0;
        for (int h = 0; h < arrayMix1; h++) {
            if (arrayMix[h] < min) {
                min = arrayMix[h];
            }
            if (arrayMix[h] > max) {
                max = arrayMix[h];
            }
        }

        System.out.println("Минимальное число из массива:" + min);
        System.out.println("Максимальное число из массива:" + max);
    }
}
