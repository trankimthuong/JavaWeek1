package circleandcylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        this.height = 1;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    public String toString(){
        return "Cylinder has radius = " + this.getRadius() + ", color = " + this.getColor() + ", height = " + this.height
                + ", volume = " + this.getVolume();
    }
}
