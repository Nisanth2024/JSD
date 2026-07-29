import java.util.*;
public class Task5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String n=sc.next();
        int len=n.length();
        int dec=--len;
        for(int i=0;i<len/2+1;i++)
        {
            System.out.print(n.charAt(i)+""+n.charAt(dec--));          
        }
        sc.close();
    }
}
