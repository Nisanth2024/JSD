import java.util.Scanner;
public class Task7 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter text : ");
        String n=scan.nextLine();
        int len=n.length();
        String res="";
        for(int i=0;i<len-1;i++)
        {
            char c1=n.charAt(i);
            char c2=n.charAt(i+1);
            if(c1==' ' && c2==' ')
            continue;
            else
            res=res+c1;
        }
        System.out.print(res+n.charAt(len-1)); 
        scan.close();  
    }
}
