import java.util.Scanner;
public class TwoArrayDemo {
    public static void main(String[] args) {
       // int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
       Scanner sc=new Scanner(System.in);
       System.err.print("Enter the number of rows : ");
       int row=sc.nextInt();
       System.err.print("Enter the number of columns : ");
       int col=sc.nextInt();
       int arr[][]=new int[row][col];
       System.out.println("Enter Matrix Values : "+row+"x"+col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix Values are : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
