package geometricobject;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString(){
        //A Circle with radius=xxx, which is a subclass of yyy"
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }
}
