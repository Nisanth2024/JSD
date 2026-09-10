import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args){
       // int arr[]={11,9,99,22,33,55,88,45};
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value of arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("arr["+i+"] = " +arr[i]);
        }
        sc.close();
        //=========Find Maximum Of Array=========
        //=========Find Minimum Of Array=========
        //=========Sum Of Array==================
    }
}
