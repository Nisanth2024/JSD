package advancedjava;
import java.util.Scanner;

class AgeException extends Exception {
   Scanner sc = new Scanner(System.in);

   AgeException() 
   {
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    if(age >= 18)
    {
      System.out.println("Age is Accepted"); 
    }
    else
    {
      try {
         throw new Exception("Below 18 age is not accept to vote");
      } 
      catch (Exception e) {
         System.out.println(e.toString());
      }
      new AgeException();
      
    }

   }
}
public class CustomException {
   public static void main(String args[]) {
      AgeException age = new AgeException();
   }
}