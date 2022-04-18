<<<<<<< HEAD:Input_output/src/CUI/total_percentage.java
package CUI;

import java.util.Scanner;

public class total_percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        double total_mark;
        double percentage;
        total_mark = a+b+c;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/3;
        System.out.println("Total Percentage is :" + percentage);
    }
}
=======
import java.util.Scanner;

public class total_percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        double total_mark;
        double percentage;
        total_mark = a+b+c;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
    }
}
>>>>>>> 1c222a327df305d9a78984a517c2c0ee6c0b6ffe:Input_output/src/total_percentage.java
