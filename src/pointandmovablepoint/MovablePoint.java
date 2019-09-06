package pointandmovablepoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float X, float Y, float xSpeed, float ySpeed){
        super(X, Y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }

    public String toString(){
        return "MovablePoint: {x, y} = {" + this.getX() + ", " + this.getY() + "}, {xs, ys} = {"
                + this.xSpeed + ", " + this.ySpeed + "}";
    }

    public MovablePoint move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}
