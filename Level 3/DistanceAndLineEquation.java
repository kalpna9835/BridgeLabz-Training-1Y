import java.util.Scanner;

class DistanceAndLineEquation {

    // Method to calculate Euclidean Distance
    public static double findDistance(double x1, double y1,
                                      double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow((x2 - x1), 2) +
                Math.pow((y2 - y1), 2)
        );

        return distance;
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquat
