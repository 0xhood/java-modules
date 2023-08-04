import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffe  = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 42) {
                System.out.println("Count of coffee-request : " + coffe);
                break;
            }
            int my_num = num;
            int count = 0;
            while (my_num > 0) {
                int digit = my_num % 10;

                count += digit;
                my_num /= 10;
            }
            boolean isPrime = true;

            for (int i = 2; i * i <= count; i++) {
                if (count % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                coffe++;
            }
        }
    }
}
