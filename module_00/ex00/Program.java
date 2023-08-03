class Program {
    public static void main(String[] args) {
        int my_num = 479598;
        int count = 0;
        if (my_num == 0) System.out.println(0);
        if (my_num < 0) System.out.println("Error");
        while (my_num > 0) {
            int digit = my_num % 10;

            count += digit;
            my_num /= 10;
        }
        System.out.println(count);
    }
}