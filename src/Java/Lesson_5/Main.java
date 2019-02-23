package Java.Lesson_5;

public class Main {
    public static void main(String[] args) {
        Staff_Member[] persArray = new Staff_Member[5];
        persArray[0] = new Staff_Member(
                1,
                "Сулаев Денис",
                "Программист Java",
                "sulaev@gmail.com",
                "120000",
                "+7-900-800-1010",
                25);
        persArray[1] = new Staff_Member(
                2,
                "Сулаева Татьяна",
                "Шеф-повар",
                "sulaeva@gmail.com",
                "85000",
                "+7-900-600-1512",
                25);
        persArray[2] = new Staff_Member(
                3,
                "Черномашенцев Сергей",
                "Повар",
                "desorder_90@gmail.com",
                "40000",
                "+7-900-500-1240",
                27);
        persArray[3] = new Staff_Member(
                4,
                "Расщупкин Виталий",
                "Повар",
                "vitalya_ras@gmail.com",
                "40000",
                "+7-900-460-1236",
                48);
        persArray[4] = new Staff_Member(
                5,
                "Шлык Дарья",
                "Кондитер",
                "shlyk_daria@gmail.com",
                "40000",
                "+7-950-800-3465",
                42);
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].printInfo();


    }

}
