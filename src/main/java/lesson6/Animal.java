package lesson6;

public class Animal {
    static int cnt;
    protected String name;

    public Animal(String name) {
        this.name = name;
        cnt++;
    }

    public void run(int length) {
        System.out.printf("%s пробежал %s метров%n", name, length);
    }

    public void swim(int length) {
        System.out.printf("%s проплыл %s метров%n", name, length);
    }

}
