public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    public String toStringMammal() {
        return "Mammal[" +
                super.toString() +
                ']';
    }
}
