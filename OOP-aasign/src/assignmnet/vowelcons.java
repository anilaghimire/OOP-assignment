package assignmnet;

import java.util.Scanner;

public class vowelcons {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Enter an alphabet: "));
            String alpha= scanner.next();
            if (alpha=="a")
                System.out.println("it is a vowel");
            else if (alpha=="e")
                System.out.println("it is a vowel");
            else if (alpha=="i")
                System.out.println("it is a vowel");
            else if (alpha=="o")
                System.out.println("it is a vowel");
            else if (alpha=="u")
                System.out.println("it is a vowel");
            else
                System.out.println("it is consonant.");
        }
    }

