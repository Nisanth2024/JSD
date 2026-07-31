//Sum of digits program
import java.util.Scanner;
public class While {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr N Value : ");
        long n=scan.nextLong();
        long r,s=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
        }
        System.out.print("Sum of digits : "+s);
        scan.close();
    }
}
