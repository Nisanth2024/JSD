import java.util.*;
public class Task3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name =scan.nextLine(); 
        int n=name.length();
        int count=0;

        for(int i=0;i<n;i++){
           
           // if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
            //   char c=name.charAt(i);
              // switch(c){
                //case 'a':case'e':case'i':case'o':case'u':
                //case 'A':case'E':case'I':case'O':case'U':
                System.out.println(name.charAt(i));
                count++;

                
            }                
        
      //  System.out.println( "("+count+")");
        scan.close();
    }
}
