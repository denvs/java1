package lesson6;

public class Cat extends Animal {
    static int cnt;
    static final int MAX_RUN = 200;

    public Cat(String name) {
        super(name);
        cnt++;
    }

    @Override
    public void run(int length) {
        if (length > MAX_RUN) {
            System.out.printf("Коты не могут бегать больше %s метров%n", MAX_RUN);
        } else {
            System.out.printf("Кот %s пробежал %s метров%n", name, length);
        }
     }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }
}
