
import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N =sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<N;i++){
            System.out.print(a + " ");
            int c= a+b;
            a=b;
            b=c;    
        }
        sc.close();

    }

}