import java.lang.Math;

public class LineComparisonComputation {
    public static void main(String[] args) {

        double x1 = 3;
        double y1 = 4;
        double x2 = 6;
        double y2 = 7;
        double z1 = Math.pow((x2 - x1), 2);
        double z2 = Math.pow((y2 - y1), 2);
        double a = 3;
        double b = 5;
        double c = 4;
        double d = 8;
        double a1 = Math.pow((a - b), 2);
        double a2 = Math.pow((c - d), 2);
        // Calculate Length between two points
        double length = Math.sqrt(z1 + z2);
        double length1 = Math.sqrt(a1 + a2);
        System.out.println("length between two points :" + length);
        System.out.println("length1 between two points :" + length1);
        if (length == length1) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }

}
