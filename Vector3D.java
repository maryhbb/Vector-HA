public class Vector3D implements myVector {

    //Fields
    private Point3D point;
    private double vectorLength;
    private double x;
    private double y;
    private double z;

    Vector3D(Point3D point) {
        this.point = point;

        this.x = point.getX2() - point.getX1();
        this.y = point.getY2() - point.getY1();
        this.z = point.getZ2() - point.getZ1();

        vectorLength = Math.abs(Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2))));
    }

    @Override
    public double getVectorLength() {
        return vectorLength;
    }

    @Override
    public String toString() {
        return String.format("Die 3DVektor-Länge beträgt: %s, x: %s, y: %s, z: %s", vectorLength, x, y , z);

    }
}
