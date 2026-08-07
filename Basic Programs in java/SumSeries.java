
import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n Value : ");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==1)
            {
                sum=sum+i;
                System.out.print(i+"-");
            }
            else{
                sum=sum-i;
                System.out.print(i+"+");

            }
        }
        System.out.print("\b="+sum);
        scan.close();
    }
}
