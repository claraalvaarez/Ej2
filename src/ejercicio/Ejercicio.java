package ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio {

    // 1
    public static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {
            return sum(n - 1, sum + n);
        }
    }

    public static int sum(int n) {
        return sum(n, 0);
    }

    // 2
    public static int factorial(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            return factorial(n - 1, result * n);
        }
    }

    public static int factorial(int n) {
        return factorial(n, 1);
    }

    // 3
    public static int power(int base, int exponent, int result) {
        if (exponent == 0) {
            return result;
        } else {
            return power(base, exponent - 1, result * base);
        }
    }

    public static int power(int base, int exponent) {
        return power(base, exponent, 1);
    }

    // 4
    public static int sumOfElements(int[] array, int sum, int index) {
        if (index == array.length) {
            return sum;
        } else {
            return sumOfElements(array, sum + array[index], index + 1);
        }
    }

    public static int sumOfElements(int[] array) {
        return sumOfElements(array, 0, 0);
    }

    public static double sumOfElements(double[] array, double sum, int index) {
        if (index == array.length) {
            return sum;
        } else {
            return sumOfElements(array, sum + array[index], index + 1);
        }
    }

    public static double sumOfElements(double[] array) {
        return sumOfElements(array, 0, 0);
    }

    // 5
    public static double average(int[] array) {
        return (double) sumOfElements(array) / array.length;
    }

    // 6
    public static double standardDeviation(double[] array) {
        double avg = average(Arrays.stream(array).mapToInt(i -> (int) i).toArray());
        double[] squaredDeviations = Arrays.stream(array).map(i -> Math.pow(i - avg, 2)).toArray();
        double sumOfSquaredDeviations = sumOfElements(squaredDeviations);
        return Math.sqrt(sumOfSquaredDeviations / array.length);
    }

    // 7
    public static int evenSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n + evenSum(n - 2);
        } else {
            return evenSum(n - 1);
        }
    }

    // 8
    public static int arrayEvenSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // 9
    public static ArrayList<Integer> evenCollector(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    // 10
    public static ArrayList<Integer> evenList(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            result.add(i);
        }
        return result;
    }

    // 11
    public static int arrayProduct(int[] array1, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }

    // 12
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 13
    public static double fibonacciRatio(int n) {
        double termNMinus1 = fibonacci(n - 1);
        double termN = fibonacci(n);
        return termN / termNMinus1;
    }

    // 14
    public static void printFibonacci1213Ratio() {
        double ratio = fibonacciRatio(13);
        System.out.println("Proporción entre los términos 12 y 13 de Fibonacci: " + ratio);
    }
}