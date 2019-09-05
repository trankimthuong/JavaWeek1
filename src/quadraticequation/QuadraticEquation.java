package quadraticequation;

public class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2.0) - 4 * this.a * this.c;
    }

    public void getRoot(){
        double delta = getDiscriminant();
        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem!!!");
        }else if (delta == 0){
            System.out.println("Phuong trinh co nghiem duy nhat: " + (-b) / (2 * a));
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phuong trinh co 2 nghiem phan biet: x1 = %f, x2 = %f", x1, x2);
        }
    }

}
