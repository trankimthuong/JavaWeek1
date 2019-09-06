package pointandmovablepoint;

public class Point {
    private float X;
    private float Y;

    public Point(float X, float Y){
        this.X = X;
        this.Y = Y;
    }

    public Point(){
        this.X = 0;
        this.Y = 0;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public void setXY(float X, float Y){
        this.X = X;
        this.Y = Y;
    }

    public float[] getXY(){
        float[] result = new float[2];
        result[0] = this.X;
        result[1] = this.Y;
        return result;
    }

    public String toString(){
        return "Point: {" + this.X + ", " + this.Y + "}";
    }
}
