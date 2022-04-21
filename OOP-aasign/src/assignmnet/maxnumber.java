package assignmnet;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter a number: "));
        int a= scanner.nextInt();
        System.out.println(("Enter second number: "));
        int b= scanner.nextInt();
        if (a>b)
            System.out.println("first number is greater than the second one");
        else
            System.out.println("second number is greater");
        }
    }

