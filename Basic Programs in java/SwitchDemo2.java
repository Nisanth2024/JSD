import java.util.Scanner;
public class SwitchDemo2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int a = scan.nextInt();
        System.out.print("Enter a number2 : ");
        int b = scan.nextInt();
        System.out.print("Enter your choice (Add/Sub/Mul/Div/Rem) : ");
        String ch = scan.next();

        switch(ch) {
            case "Add": case "add": case "ADD":
                System.out.println("Addition : " + (a+b));
                break;
            case "Sub": case "sub": case "SUB":
                System.out.println("Subtraction : " + (a-b));
                break;
            case "Mul": case "mul": case "MUL":
                System.out.println("Multiplication : " + (a*b));
                break;
            case "Div": case "div": case "DIV":
                System.out.println("Division : " + (a/b));
                break;
            case "Rem": case "rem": case "REM":
                System.out.println("Remainder : " + (a%b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scan.close();
    }
}
