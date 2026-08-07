import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*     
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        if(number / 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    */
    /* 
        System.out.print("Enter a number : ");
        int number1 = scan.nextInt();
        System.out.print("Enter a number : ");
        int number2 = scan.nextInt();
        if(number1 > number2) {
            System.out.println("The  greatest number is : " + number1);
        } 
        else  {
            System.out.println("The  greatest number is : " + number2);
        }
        
    */
    /* 
        System.out.print("Enter Your Age : ");
        int age = scan.nextInt();
        if(age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    */
    /*
        System.out.print("Enter a Year : ");
        int year = scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
     */

        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if(age >= 21) {
            System.out.println("You are eligible to Marriage");
        } else {
            System.out.println("You are not eligible to Marriage. So Study Well!!");
        }

        scan.close();
    }
}
