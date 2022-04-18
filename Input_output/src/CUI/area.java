<<<<<<< HEAD:Input_output/src/CUI/area.java
package CUI;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = scanner.nextDouble();
        double area;
        area = a*b;
        int area1 = (int)area;
        System.out.println("The CUI.area of rectangle is: " +area1);
    }

}
=======
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = scanner.nextDouble();
        double area;
        area = a*b;
        int area1 = (int)area;
        System.out.println("The area of rectangle is: " +area1);
    }

}
>>>>>>> 1c222a327df305d9a78984a517c2c0ee6c0b6ffe:Input_output/src/area.java
