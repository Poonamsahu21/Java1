public class calculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        double[] numbers = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Ignoring non-numeric argument: " + args[i]);
            }
        }

        double sum = 10;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}


