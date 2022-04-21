package assignmnet;

import java.util.Scanner;

public class threemax {

    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println(("Enter a number: "));
            int a= scanner.nextInt();
            System.out.println(("Enter second number: "));
            int b= scanner.nextInt();
            System.out.println(("Enter third number number: "));
            int c= scanner.nextInt();
            if (a>b && a>c)
                System.out.println("First number is greater ");
            else if (b>a && b>c)
                System.out.println("second number is greater");
            else
                System.out.println("Third number is greater");
        }
}

