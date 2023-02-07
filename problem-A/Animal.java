public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toStringAnimal() {
        return "Animal[" +
                "name='" + name + '\'' +
                ']';
    }
}
