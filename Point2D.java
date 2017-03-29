
/**
 * Created by tomek on 14.03.2017.
 */
public class Point2D {
    protected double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;

    }

    public String toString(double x, double y) {
        System.out.println(toString(this.x, this.y));
        return super.toString();
    }

    public double distance(Point2D a,Point2D b){
        double distance2D = Math.pow((Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2)),0.5);
        return distance2D;
    }
}
