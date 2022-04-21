package assignmnet;

import java.util.Scanner;

public class leapyear {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Enter a days: "));
            int a = scanner.nextInt();
            if (a%400==0)
                System.out.println("the year is leap year");
            else
                System.out.println("the year is not normal year");
        }
    }

