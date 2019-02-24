package Java.Lesson_6;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2, 0, 200);
        Dog dog = new Dog("Шарик", 0.5,10,500);
        dog.animalInfo();
        dog.voice();
        cat.animalInfo();
        cat.voice();
        cat.checkRun(800);
        dog.checkRun(150);
    }
}
