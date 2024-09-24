public class assign4 {
    public static void main(String[] args) {
        // Labeled break example
        System.out.println("Labeled break example:");
        outerLoop: // Label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of both loops at i=" + i + ", j=" + j);
                    break outerLoop; // Breaks out of outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // Labeled continue example
        System.out.println("\nLabeled continue example:");
        outerLoop: // Label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Continuing outer loop at i=" + i + ", j=" + j);
                    continue outerLoop; // Continues with next iteration of outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}


