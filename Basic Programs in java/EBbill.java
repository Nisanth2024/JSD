import java.util.Scanner;
public class EBbill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Unit : ");
        int unit = scan.nextInt();
        float bill=0.0f;
         if(unit <=500) {
          if(unit <=200){
                bill = 0.0f;
            }
            else if(unit >=201 && unit <=400) {
                bill = (unit - 200) * 4.70f;
            }
            else{
                bill = (unit - 400) * 6.30f + (200 * 4.70f);
            }
         
        }
         else {
            if(unit >=501 && unit <=600) {
                  
              bill = (unit - 500) * 8.40f + (100 * 6.30f) + (300 * 4.70f);          
               }
            else if(unit >=601 && unit <=800) {
                bill = (unit - 600) * 9.45f + (100 * 8.40f) + (100 * 6.30f) + (300 * 4.70f);
                System.out.println("Total Bill : " + bill);
            }
            else
            {
                System.out.println("Unit is greater than 800, please enter a valid unit.");
            }
         }

        
        scan.close();
                  
        
    }
}
