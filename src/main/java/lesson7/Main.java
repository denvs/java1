package lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(12);
        plate.printInfo();

        Cat[] catArray = new Cat[3];
        catArray[0] =  new Cat("Барсик", 5);
        catArray[1] =  new Cat("Ричрд", 4);
        catArray[2] =  new Cat("Вася", 6);

        for (Cat cat:catArray) {
            cat.eat(plate);
            plate.printInfo();
        }
        for (Cat cat: catArray) {
            cat.printInfo();
        }
        plate.addFood(10);
        plate.printInfo();
    }
}
