import java.util.Scanner;

public class DrawStarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        String star = "*";
        int n, s;

        do {
            System.out.println("Please enter a positive and odd number to determine the size of the diamond you want to draw: ");
            n = input.nextInt();
            if (n > 0 && n%2==1) {
                isError = true;
            }
        }
        while (!isError);

        n /= 2;
        n++;
        s = n;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }


        for (int l = 1; l <= (s - 1); l++) {
            for (int m = 0; m <= l - 1; m++) {
                System.out.print(" ");
            }
            for (int p = 1; p < 2 * (s - l); p++) {
                System.out.print(star);
            }
            System.out.println();
        }


    }
}
