public class Vector2D implements myVector {

   //Fields
    private Point2D point;
    private double vectorLength;
    private double x;
    private double y;

    //Constructor
    Vector2D(Point2D point){
        this.point = point;

        this.x = point.getX2() - point.getX1();
        this.y = point.getY2() - point.getY1();

        vectorLength = Math.abs(Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))));
    }

    @Override
    public double getVectorLength() {
        return vectorLength;
    }

    @Override
    public String toString(){
        return String.format("Die 2DVektor-Länge beträgt: %s, x: %s, y: %s", vectorLength, x, y);
    }
}
