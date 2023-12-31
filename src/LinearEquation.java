public class LinearEquation {
    private int x,y;
    private double slope;
    public int x2, y2;
    public double yIntercept;
    public LinearEquation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int LinearEquation(int x) {
        this.x = x;
        return x;
    }

    public void slope(double x, double y, int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
        slope = (double) Math.round((rise() / run()) * 100) / 100;
    }

    public double y_intercept() {
        yIntercept = (double) Math.round(y - (slope * x * 100)) / 100;
        return yIntercept;
    }

    public double rise() {
        return y-y2;
    }

    public double run() {
        return x-x2;
    }

    public String slopeIntercept() {
        if (y_intercept() > 0) {
            return "y = " + rise() + "/" + run() + "x " + "+ " + y_intercept(); }
        else { return "y = " + rise() + "/" + run() + "x " + y_intercept(); }
    }

    public double distanceBetweenPoints() {
        return (double) Math.round(Math.sqrt((Math.pow(run(), 2)) + Math.pow(rise(), 2)) * 100) / 100;
    }
    public double yCoordinateCalc() {
        return (double) Math.round((slope * x) * 100) / 100 + yIntercept;
    }

    public String toString () {
        return "First pair: (" + x + ", " + y + ")\n" +
                "Second pair: (" + x2 + ", " + y2 + ")\n" +
                "Slope of line: " + slope + "\n" +
                "Y -intercept: " + y_intercept() + "\n" +
                slopeIntercept() + "\n" +
                "Distance between points: " + distanceBetweenPoints();
    }
}
