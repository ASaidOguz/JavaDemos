public class Main {
    public static void main(String[] args) {
        //220-284 arkadaş sayılardır!!
        int x = 220;
        int y = 284;
        if ((x == FriendsNumber(284) && (y == FriendsNumber(220)))) {
            System.out.println("x ve y arkadaş sayılardır!!");
        } else {
            System.out.println("x ve y arkadaş sayı değiller!!");
        }

    }

    public static int FriendsNumber(int s) {

        int sum = 0;
        for (int i = 1; i < s; i++) {
            if (s % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

