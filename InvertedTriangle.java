import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String star = "*";
        int n, i, j, k;

        do {
            System.out.println("Please enter a number to determine the size of the inverted triangle you want to draw: ");
            n = inp.nextInt();
        }
        while (n <= 0);


        for (i = 1; i < n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print(star);
            }
            System.out.println();

        }


    }
}
