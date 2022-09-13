public class FactorPrinter {

    public static void printFactors (int number) {
        // Edge Cases
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        // iterate through number and find factors
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(number);
    }
}
