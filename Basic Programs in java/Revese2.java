import java.util.Scanner;
public class Revese2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int n=sc.nextInt();
        int r =0;
        int rem =0;
        while(n!=0){
            n=n/10;
            rem=n%10;
            r=r*10+rem;
            //n=n/10;
        }
        System.out.print(n);

        sc.close();
    }
}
