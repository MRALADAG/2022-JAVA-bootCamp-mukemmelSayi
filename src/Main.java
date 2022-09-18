public class Main {
    public static void main(String[] args) {

        int number = 28;
        System.out.println(findMukemmelSayi(number) ? "\nSayı mükemmel sayıdır.\n" : "\nSayı mükemmel sayı değildir.");

    }

    public static boolean findMukemmelSayi(int number) {
        boolean result = false;
        int total = 0;

        if (number > 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }

            if (total == number) {
                result = true;
            }
        }
        return result;
    }
}
