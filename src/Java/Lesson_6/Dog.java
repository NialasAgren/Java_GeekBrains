package Java.Lesson_6;

public class Dog extends Animal {

    public Dog(String name, double jump, int swim, int run) {
        this.name = name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

    @Override
    void animalInfo() {
        System.out.println("_________________________");
        System.out.println("Собака по имени: " + name);
        System.out.println("_________________________");
        System.out.println("Максимальное расстояние прыжка собаки: " + jump + " метров");
        System.out.println("Максимальное расстояние заплыва собаки: " + swim + " метров");
        System.out.println("Максимальное расстояние бега собаки: " + run + " метров");
    }

    @Override
    void voice() {
        System.out.println("Собака гавкнула");
    }
}
