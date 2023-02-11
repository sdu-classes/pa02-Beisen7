public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle(){}

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(  double width, double length,String color,boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle["+super.toString()+"width='"+width+",length="+length+']';
    }
}
