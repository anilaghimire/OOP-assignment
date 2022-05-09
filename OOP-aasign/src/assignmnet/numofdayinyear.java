package assignmnet;

import java.util.Scanner;

public class numofdayinyear {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Enter a month number: "));
            int monthnumber = scanner.nextInt();
            System.out.println(("Enter year number: "));
            int year = scanner.nextInt();
            if (monthnumber == 1)
                System.out.println("there are 31 days.");
            if (monthnumber == 2) {
                if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0)
                    System.out.println("there are 29 days");
                else
                    System.out.println("there are 28 days");
            }
            if (monthnumber == 3)
                System.out.println("there are 31 days.");
            if (monthnumber == 4)
                System.out.println("there are 30 days");
            if (monthnumber == 5)
                System.out.println("there are 31 days.");
            if (monthnumber == 6)
                System.out.println("there are 30 days");
            if (monthnumber == 7)
                System.out.println("there are 31 days.");
            if (monthnumber == 8)
                System.out.println("there are 31 days.");
            if (monthnumber == 9)
                System.out.println("there are 30 days.");
            if (monthnumber == 10)
                System.out.println("there are 31 days.");
            if (monthnumber == 11)
                System.out.println("there are 30 days.");
            if (monthnumber == 12)
                System.out.println("there are 31 days.");
            else
                System.out.println("");
        }

    }


