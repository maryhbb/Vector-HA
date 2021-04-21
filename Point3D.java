
public class Point3D extends Point2D {
    private double z1;
    private double z2;

    //Constructor

    public Point3D(double x1, double x2, double y1, double y2, double z1, double z2) {
        super(x1, x2, y1, y2);
        this.z1 = z1;
        this.z2 = z2;
    }

    public double getZ1() {
        return z1;
    }

    public double getZ2() {
        return z2;
    }


    }



