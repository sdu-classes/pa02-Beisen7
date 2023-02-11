public class Square extends Rectangle{
    double side;
    String color = "black";

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
        this.color = color;
    }

    public Square(double width, double length, String color, boolean filled, double side) {
        super( color, filled);
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        System.out.println("The length and width shall be set to the same value.");
        this.width = side;
    }

    public void setLength(double side) {
        System.out.println("The length and width shall be set to the same value.");
        this.length = side;
    }

    public double getArea(){
        return side*side;
    }

    public String getColor(){
        return "black";
    }

    @Override
    public String toString() {
        return "Square[" + super.toString()+
                ']';
    }
}
