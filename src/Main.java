import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder forward, back, odd, even;
        forward = new StringBuilder();
        back = new StringBuilder();
        odd = new StringBuilder();
        even = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            forward.append(i).append(" ");
            back.append(11 - i).append(" ");
            odd.append((i * 2) - 1).append(" ");
            even.append(i * 2).append(" ");
        }

        System.out.println(forward + "\n" + back + "\n" + odd + "\n" + even);

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numToCount = read.nextInt();
        int sum2 = 0;
        int factorial = 1;
        for (int i = numToCount; i > 0; i--) {
            System.out.print(i + " ");
            sum2 += i;
            factorial = factorial * i;
        }
        System.out.println("\nSum from 1-10: " + sum + "\nSum from 1-" + numToCount + ": "
                + sum2 + "\nFactorial for " + numToCount + ": " + factorial);


        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.println("**********");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < 6; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
