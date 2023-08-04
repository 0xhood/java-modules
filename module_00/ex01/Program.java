import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        boolean isPrime = true;
        int iterations = 0;

        for (int i = 2; i * i <= number; i++) {
            iterations++;
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime + " " + iterations);
    }
}
