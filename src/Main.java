import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //asking for first ordered pair
        System.out.print("Enter your first coordinate point: ");
        String a = s.nextLine();

        //getting x coordinate from string to int
        int a1 = a.indexOf(",");
        String a11 = (a.substring(1, a1));
        int x1 = Integer.parseInt(a11);
        //getting y coordinate from string to int
        int b1 = a.indexOf(")");
        String b11 = (a.substring(a1 + 1, b1));
        int y1 = Integer.parseInt(b11);

        //asking for second ordered pair
        System.out.print("Enter your second coordinate point: ");
        String b = s.nextLine();

        //getting x2 coordinate from string to int
        int a2 = b.indexOf(",");
        String a22 = (b.substring(1, a2));
        int x2 = Integer.parseInt(a22);
        //getting y2 coordinate from string to int
        int b2 = b.indexOf(")");
        String b22 = (b.substring(a2 + 1, b2));
        int y2 = Integer.parseInt(b22);

        //stores first and second ordered pair
        LinearEquation calc = new LinearEquation(x1, y1);
        calc.slope(x1, y1, x2, y2);
        calc.y_intercept();
        calc.slopeIntercept();
        calc.distanceBetweenPoints();
        System.out.println(calc.toString());

        //3rd x value and coordinate point
        System.out.print("Enter a third x value: ");
        String c = s.nextLine();
        int x3 = Integer.parseInt(c);
        calc.LinearEquation(x3);
        System.out.println("Solved coordinate point is: (" + x3 + ", " + calc.yCoordinateCalc() + ")");



    }
}
