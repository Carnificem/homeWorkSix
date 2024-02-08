public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println("число " + a);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println("число " + a);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println("Число " + a);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a--) {
            System.out.println("число " + a);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + " год является высокосным");
        }
        //Задача 6
        System.out.println("Задача 6");
        int b = 7;
        for (int a = 7; a <= 98; a = a + b) {
            System.out.println(a);
        }
        //Задача 7
        System.out.println("задача 7");
        for (int a = 1; a <= 512; a = a * 2) {
            System.out.println(a);
        }
        //Задача 8
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int a = 1; a <= 12; a++) {
            total = total + accumulation;
            System.out.println("Месяц " + a + " сумма накоплений " + total);
        }
        //Задача 9
        System.out.println("Задача 9");
        accumulation = 29000;
        total = 0;
        for (int a = 1; a <= 12; a++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + a + " сумма накоплений " + total);
        }
        //Задача 10
        System.out.println("Задача 10");
        int i = 2;
        for (int f = 1; f <= 10; f++) {
            System.out.println(i + "*" + f + "=" + i * f);
        }
    }
}






