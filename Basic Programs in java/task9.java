import java.util.Scanner;
public class task9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String n=scan.next();
        System.out.print("Enter Search Letter : ");
        String s=scan.next();
        int len=n.length();
        int count = 0;
        for(int i=0;i<len;i++){
            if(n.charAt(i)==s.charAt(0)){
                if(count==0){
                    System.out.print(s+" is found at index : "+i);
                } else {
                    System.out.print(","+i);
                }
                count++;
            }
        }
        if(count==0){
            System.out.print(s+" is not found");
        }
        scan.close();
    }
}