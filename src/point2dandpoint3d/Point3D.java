package point2dandpoint3d;

public class Point3D extends Point2D {
    private float Z;
    public Point3D(){
        this.Z = 0;
    }

    public Point3D(float X, float Y, float Z){
        super(X, Y);
        this.Z = Z;
    }

    public float getZ() {
        return Z;
    }

    public void setZ(float z) {
        Z = z;
    }

    public void setXYZ(float X, float Y, float Z){
        this.setX(X);
        this.setY(Y);
        this.Z = Z;
    }

    public float[] getXYZ(){
        float[] result = new float[3];
        result[0] = this.getX();
        result[1] = this.getY();
        result[2] = this.Z;
        return result;
    }

    public String toString(){
        return "Point3D: {" + this.getX() + ", " + this.getY() + ", " + this.Z + "}";
    }
}
