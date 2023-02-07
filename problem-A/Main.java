public class Main {
    public static void main(String[] args) {
        String nameOfDog = "Aqto's"; // Qazaqpyzg'oi
        String nameOfCat = "Barsik"; // Qazaqpyzg'oi x2

        Dog dog = new Dog(nameOfDog);

        Cat cat = new Cat(nameOfCat);

        Dog wolf = new Dog("Kaskyr");

        Animal animal = new Animal("Januar");

        System.out.println(animal.toStringAnimal());
        System.out.println(dog);
        System.out.println(cat);

        dog.greets();
        cat.greets();

        dog.greets(wolf);
    }
}
