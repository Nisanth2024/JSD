import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int a = scan.nextInt();
        System.out.print("Enter a number2 : ");
        int b = scan.nextInt();
        System.out.println("Enter your choice 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Modulus");
        int ch = scan.nextInt();

        switch(ch) {
            case 1:
                System.out.println("Addition : " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction : " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication : " + (a*b));
                break;
            case 4:
                System.out.println("Division : " + (a/b));
                break;
            case 5:
                System.out.println("Remainder : " + (a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
