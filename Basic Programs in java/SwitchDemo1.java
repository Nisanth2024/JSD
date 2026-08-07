import java.util.Scanner;
public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int a = scan.nextInt();
        System.out.print("Enter a number2 : ");
        int b = scan.nextInt();
        System.out.println("Enter your choice A. Addition S. Subtraction M. Multiplication D. Division R. Modulus");
        char ch = scan.next().charAt(0);

        switch(ch) {
            case 'A': case 'a':            
                System.out.println("Addition : " + (a+b));
                break;
            case 'S': case 's':
                System.out.println("Subtraction : " + (a-b));
                break;
            case 'M': case 'm':
                System.out.println("Multiplication : " + (a*b));
                break;
            case 'D': case 'd':
                System.out.println("Division : " + (a/b));
                break;
            case 'R': case 'r':
                System.out.println("Remainder : " + (a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}