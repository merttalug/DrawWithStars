import java.util.Scanner;
public class DrawStarPine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        String star = "*";
        int n;

        do {
            System.out.println("Please enter a number to determine the size of the pine you want to draw: ");
            n = input.nextInt();
            if (n > 0) {
                isError = true;
            }
        }
        while (!isError);

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
