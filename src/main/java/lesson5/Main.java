package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] =  new Person("Ivanov Ivan", "Engineer", "ivan.ivanov@job.ru",
                "7 499 922-47-10", 100000.20f, 27);
        personArray[1] =  new Person("Alex", "Engineer", "alexv@job.ru",
                "7 499 922-47-11", 110000, 56);
        personArray[2] =  new Person("Dima", "Engineer", "dima@job.ru",
                "7 499 922-47-12", 120000, 33);
        personArray[3] =  new Person("Roma", "Engineer", "roma@job.ru",
                "7 499 922-47-13", 90000, 43);
        personArray[4] =  new Person("Denis", "Engineer", "denis@job.ru",
                "7 499 922-47-14", 80000, 32);

        for (Person person: personArray) {
            if (person.getAge() > 40) {
                person.printInfo();
            }
        }
    }
}
