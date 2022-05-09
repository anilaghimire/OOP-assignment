//a goverment wants to provide student loan to student in their country. But for student to be eligible for
//getting student loan, s/he must be in age range 18 to 21 and must have minimumn of 80% marks in academics.
//wap to accept the name, age and marks of the student and display if s/he is eligble for the loan or not.

import java.util.Scanner;

public class schoeligibility {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Your Name: ");
            String name = scanner.next();
            System.out.print("Enter Your Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Your Marks: ");
            int mark = scanner.nextInt();
            if (age >= 18 && age < 21) {
                if (mark >= 80) {
                    System.out.println("Congratulation! " + name + " You are Eligible for Student Loan");
                }
                else {
                    System.out.println("Sorry," + name  +  " You are not eligible for Student Loan");
                }
            }

            else {
                System.out.println("Sorry, "+ name  +  " You are not eligible for Student Loan");
            }

        }
    }





