package lesson7;

public class Plate {
    private int foodCount;
    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }
    public boolean decreaseFood(int n) {
        if (foodCount >= n) {
            foodCount -= n;
            System.out.printf("Объём миски уменьшился на %s%n", n);
            return true;
        }
        else {
            System.out.println("В миске недостаточно корма");
        }
        return false;
    }
    public void printInfo() {
        System.out.printf("В миске осталось %s еды%n", foodCount);
    }

    public void addFood(int i) {
        foodCount += i;
    }
}
