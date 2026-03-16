package com.gla.method.Level2;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }

        double avg = (double) sum / numbers.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        int[] arr = generate4DigitRandomArray(5);

        for (int n : arr) {
            System.out.println(n);
        }

        double[] result = findAverageMinMax(arr);

        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}

