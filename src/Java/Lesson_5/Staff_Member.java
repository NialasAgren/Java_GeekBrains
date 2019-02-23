package Java.Lesson_5;

public class Staff_Member {

    private int id;
    public String name;
    public String job;
    public String e_mail;
    public String payment;
    public String telephone;
    public int age;

    public Staff_Member(int id, String name, String job, String e_mail, String payment, String telephone, int age) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.e_mail = e_mail;
        this.payment = payment;
        this.telephone = telephone;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + job);
        System.out.println("E-mail: " + e_mail);
        System.out.println("Заработная плата: " + payment + " рублей");
        System.out.println("Телефон: " + telephone);
        System.out.println("Возраст: " + age );
        System.out.println("__________________________________");
    }

    public int getAge() {
        return age;
    }
}
