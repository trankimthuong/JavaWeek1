package geometricobject;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        //"A Shape with color of xxx and filled/not filled"
        if(this.filled){
            return "A shape with color of " + this.color + " and filled";
        } else {
            return "A shape with color of " + this.color + " and not filled";
        }
    }
}
