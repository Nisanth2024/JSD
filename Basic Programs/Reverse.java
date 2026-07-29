import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter n Value : ");
        int n=scan.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
