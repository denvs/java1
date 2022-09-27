package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(15, 6));
        PositiveOrNegative(45);
        System.out.println(isNegative(-78));
        printWordNTimes("str", 4);
        System.out.println(isLeapYear(2022));
    }

//1)
    public static boolean within10and20(int x1, int x2) {
        int y = x1 + x2;
        return y >= 10 && y <= 20;
    }
//2)
    public static void PositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
//3)
    public static boolean isNegative(int x) {
        return x < 0;
    }
//4)
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
//5)
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)  || (year % 400 == 0);
    }

}
