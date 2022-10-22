package lesson6;

public class Dog extends Animal {
    static int cnt;
    static final int MAX_RUN = 500;
    static final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name);
        cnt++;
    }

    @Override
    public void run(int length) {
        if (length > MAX_RUN) {
            System.out.printf("Собаки не могут бегать больше %s метров%n", MAX_RUN);
        } else {
            System.out.printf("Собака %s пробежала %s метров%n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > MAX_SWIM) {
            System.out.printf("Собаки не могут плавать больше %s метров%n", MAX_SWIM);
        } else {
            System.out.printf("Собака %s проплыла %s метров%n", name, length);
        }
    }
}
