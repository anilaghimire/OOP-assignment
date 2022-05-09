import java.util.Scanner;

public class oddeve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scanner.nextInt();
        int rem = num %2;
        switch(rem){
            case 0:
                System.out.println(num + "is even");
                break;
            case 1:
                System.out.println(num + "is odd");
                break;

        }
    }
}
