import java.util.*;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i*5;
            System.out.println(i + " * 5 = " +a);
        }
        sc.close();
        }
    }

