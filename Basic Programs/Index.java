
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s=0;
        System.out.print("Enter a text : ");
        String name=sc.next();
        System.out.print("Enter a Letter : ");
        char ch=sc.next().charAt(0);
        int n =name.length();
        for(int i=0;i<n;i++)
        {
            if(name.charAt(i)==ch)
            {
                System.out.print((i));
                s++;

            }          

        }
        if (s==0)
            System.out.print("Invalid Input");
        sc.close();

    }
}
