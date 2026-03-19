class RandomNumbers {
    static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;

        for (int x : arr) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        return new double[]{(double)sum / arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);

        for (int x : arr) System.out.print(x + " ");
        System.out.println("\nAverage: " + res[0]);
        System.out.println("Min: " + res[1]);
        System.out.println("Max: " + res[2]);
    }
}
