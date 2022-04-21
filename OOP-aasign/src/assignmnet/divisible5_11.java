package assignmnet;

import java.util.Scanner;

public class divisible5_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Enter a number: "));
            int a= scanner.nextInt();
            if (a%5==0 && a%11==0)
                System.out.println("the number is divisible by 5 and 11");
            else
                System.out.println("the number is not divisible by 5 and 11.");
        }
    }

