package Java.Lesson_1;

public class lesson_1 {

    // Целочисленные типы
    byte aByte = 27;
    short aShort = 123;
    int anInt = 999;
    long aLong = 100000000;

    //Типы с плавающей запятой (точкой)
    float aFloat = 124.0F;
    double aDouble = 123.0;

    //Логический тип 8 бит
    boolean aBoolean = true; //false = ложь
    //b = (byte) i; //с потерей памяти

    // Символьный тип 16 бит
    char aChar = 'a';

    //Строки
    String sting = "Привет мир!";

    public static void main(String[] args) {
//        System.out.println(args[0]);
        String result;
        result = "" + calculateVolume(2.0f, 9.9f);
        System.out.println(result);
        System.out.println("Максимум: "+ findMax(3,5));
    }

    public static float calculateVolume(float radius, float height) {
        float volume = 3.14f * radius * radius * height;
        return volume;
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return  a;
        } else {
            return  b;
        }

    }
}

