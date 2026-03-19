import java.util.Scanner;

class Quadratic {
    static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) return new double[]{};

        if (delta == 0)
            return new double[]{-b / (2 * a)};

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{r1, r2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] roots = findRoots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        for (double r : roots)
            System.out.println(r);
    }
}
