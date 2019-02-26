package Java.Lesson_6;

abstract class Animal {
    String name;
    double jump;
    int swim;
    int run;

    public Animal() {

    }

    public Animal(String name, double jump, int swim, int run) {
        this.name = name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

     void animalInfo() {
        System.out.println("Животное по имени: " + name);
        System.out.println("Максимальное расстояние прыжка: " + jump + " метров");
        System.out.println("Максимальное расстояние заплыва: " + swim + " метров");
        System.out.println("Максимальное расстояние бега: " + run + " метров");
    }

    void voice() {
        System.out.println("Животное издало звук");
    }

    void checkRun(int distance) {
        if (run > distance) {
            System.out.println(">>>>>>>>>>" + name + " пробежал(-а) забег <<<<<<<<<<");
        } else {
            System.out.println(name + " не смог(-ла) преодолеть дистанцию");
        }
    }
}
