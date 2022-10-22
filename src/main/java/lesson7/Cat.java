package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void printInfo() {
        System.out.printf("Кот %s %s%n", name, satiety ? "сытый" : "голодный");
    }
}
