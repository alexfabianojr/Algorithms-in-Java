package algorithms.workout;

import java.util.Arrays;

public class FindBiggestAndSmallest {
    public static void main(String[] args) {
        var values = new double[]{232.21, 122.0, 15.87, 15.86, 567.1, 12.4};
        smallest(values);
        biggest(values);
    }

    private static void biggest(double[] values) {
        functionalBiggest(values);
        proceduralBiggest(values);
    }

    private static void smallest(double[] values) {
        functionalSmallest(values);
        proceduralSmallest(values);
    }

    private static void proceduralBiggest(double[] values) {
        var biggest = values[0];
        for (double value : values) {
            if (value > biggest)
                biggest = value;
        }
        System.out.println("Procedural Biggest: " + biggest);
    }

    private static void functionalBiggest(double[] values) {
        var biggest = Arrays.stream(values).max().getAsDouble();
        System.out.println("Functional Biggest: " + biggest);
    }

    private static void proceduralSmallest(double[] values) {
        var smallest = values[0];
        for (double value : values) {
            if (value < smallest)
                smallest = value;
        }
        System.out.println("Procedural Smallest: " + smallest);

    }

    private static void functionalSmallest(double[] values) {
        var smallest = Arrays.stream(values).min().getAsDouble();
        System.out.println("Functional Smallest: " + smallest);
    }
}
