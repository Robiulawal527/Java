public class Line {

    private double x1, x2, y1, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findSlope() {
        return (y2 - y1) / (x2 - x1);
    }


    public String toString() {
        return "Line has points: (" + x1 + ", " + y1 + "), and (" + x2 + ", " + y2 + ")";
    }

    public static boolean isIntersecting(Line l1, Line l2) {
        double m1 = l1.findSlope();
        double m2 = l2.findSlope();
        return m1 != m2;
    }

}