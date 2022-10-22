package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat catMatros = new Cat("Матроскин");
        Dog dogBobik = new Dog("Бобик");

        catMatros.run(100);
        catMatros.swim(200);
        dogBobik.run(150);
        dogBobik.swim(300);

        System.out.printf("Всего котов: %s%n", Cat.cnt);
        System.out.printf("Всего собак: %s%n", Dog.cnt);
        System.out.printf("Всего животных: %s%n", Animal.cnt);
    }
}
