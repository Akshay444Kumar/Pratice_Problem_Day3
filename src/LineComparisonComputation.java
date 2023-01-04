import java.lang.Math;
public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        double x1=3;
        double y1=6;
        double x2=8;
        double y2=7;
        // Calculate Length between two points
        double length = Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        System.out.println("Distance between two points :" + length);
    }

}