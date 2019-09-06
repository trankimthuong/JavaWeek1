package point2dandpoint3d;

public class Point2D {
    private float X;
    private float Y;
    public Point2D(){
        this.X = 0;
        this.Y = 0;
    }

    public Point2D(float X, float Y){
        this.X = X;
        this.Y = Y;
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
        return "Point2D: {" + this.X + ", " + this.Y + "}";
    }
}
