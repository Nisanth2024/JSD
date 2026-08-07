import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N Value : ");
        int N = sc.nextInt();
        for(int i =1;i<=N;i++){
        
            System.out.print(i);
            if(N==i)
                break;
            System.out.print("+");
        }
      //    System.out.print("\b");
       //   sum=sum+i;

        }
        // System.out.println("\b = "+sum);
        
    
    }

