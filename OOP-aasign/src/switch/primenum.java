import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Positive Prime Number: ");
        int num = scanner.nextInt();
        int count = 0;
        if (num>0){
            for (int i = 1;i<=num;i++){
                if (num%i==0){
                    count = count+1;
                }
            }
            if (count==2){
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not Prime Number");
            }
        }
        else{
            System.out.println("Incorrect Input");
        }
    }
}



