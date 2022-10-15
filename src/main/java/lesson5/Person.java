package lesson5;

public class Person {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Person(String fullName, String jobTitle, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.printf("Сотрудник: %s%n", fullName);
        System.out.printf("Должность: %s%n", jobTitle);
        System.out.printf("E-mail: %s%n", email);
        System.out.printf("Телефон: %s%n", phone);
        System.out.printf("Зарплата: %s%n", salary);
        System.out.printf("Возраст: %s%n", age);
        System.out.println();
    }
    public int getAge() {
        return age;
    }
}
