package assignmnet;

import java.util.Scanner;
public class negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter a number: "));
        int a = scanner.nextInt();
        if (a > 0)
            System.out.println("Number is positive.");
        else if (a < 0)
            System.out.println("number is negative.");
        else
            System.out.println("number is zero");
    }
}
