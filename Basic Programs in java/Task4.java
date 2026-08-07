import java.util.*;
public class Task4 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=scan.next();       
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        scan.close();        
    }
}
