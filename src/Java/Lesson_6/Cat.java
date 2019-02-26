package Java.Lesson_6;

public class Cat extends Animal {

    public Cat(String name, int jump, int swim, int run) {
        this.name = name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

    @Override
    void voice() {
        System.out.println("Животное мяукнуло");
    }

    @Override
    void animalInfo() {
        System.out.println("_________________________");
        System.out.println("Кошка по имени: " + name);
        System.out.println("_________________________");
        System.out.println("Максимальное расстояние прыжка кошки: " + jump + " метров");
        System.out.println("Кошка не умеет плавать");
        System.out.println("Максимальное расстояние бега кошки: " + run + " метров");
    }
}
