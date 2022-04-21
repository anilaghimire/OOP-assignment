package assignmnet;

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(("Enter a number: "));
        int a= scanner.nextInt();
        /*
        if (a==1)
            System.out.println("the day is sunday");
        else if (a==2)
            System.out.println("the day is monday");
        else if (a==3)
            System.out.println("the day is tuesday");
        else if (a==4)
            System.out.println("the day is wednesday");
        else if (a==5)
            System.out.println("the day is thursday");
        else if (a==6)
            System.out.println("the day is friday");
        else if (a==7)
            System.out.println("the day is saturday");
        else
            System.out.println("Please enter number between 1 to 7");
        */
        switch (a){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("enter number between 1 to 7");
                break;
        }
    }
}

