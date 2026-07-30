import java.util.Scanner;
public class Task6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Text : ");
        String n=scan.next();
        int len=n.length();
        int ac=0, dc=0, sc=0;
        for(int i=0;i<len;i++)
        {
            char c=n.charAt(i);
            if(c>='a' && c<='z')
            {   
                ac++;
            }
            if(c>='0' && c<'9')
            {
                dc++;
            }
            if(c=='.')
            {
                sc++;
            }
            if(c=='@')
                break;
        }
        System.out.println("Alphabets : "+ac);
        System.out.println("Numbers : "+dc);
        System.out.println("Special Characters : "+sc);

        scan.close();
    }
}
