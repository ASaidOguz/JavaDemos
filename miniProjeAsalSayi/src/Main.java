public class Main {
    public static void main(String[] args) {

        int x = 7727;
        boolean isPrime = true;

        if (x < 1) System.out.println("Geçersiz sayı!!");

        if (x == 1) System.out.println("Sayı asal değildir!!");

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asal sayıdır.");
        } else {
            System.out.println("Sayı asal sayıd değildir.");
        }


    }
}