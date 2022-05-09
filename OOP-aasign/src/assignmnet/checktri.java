package assignmnet;

import java.util.Scanner;

public class checktri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first angle of triangle");
        int a = scanner.nextInt();
        System.out.println("enter second angle of triangle");
        int b = scanner.nextInt();
        System.out.println("enter third angle of triangle");
        int c = scanner.nextInt();
        if (a+b+c==180)
            System.out.println("triangle is valid");
        else
            System.out.println("triangle is not valid");
    }
}
