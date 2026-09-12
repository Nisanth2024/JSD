import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        //int arr[]={1,3,44,12,9,7,33,55,66,77,88,99};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter array value of index "+i+": ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Array of ["+i+"]="+arr[i]);
        }
        // task
        int max=0,min=arr[0],tot=0,esum=0;
        String sort=" ";
        for(int i=0;i<size;i++){
            // find max
            if(arr[i]>max)
                max=arr[i];
            // find min
            if(arr[i]<min)
                min=arr[i];
            // sum of array
            tot=tot+arr[i];
            //sum of even numbers in array
            if(arr[i]%2==0)    
                esum=esum+arr[i];   
        }
        // dispaly in ascending order
            for(int i=0;i<size;i++){  
                for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){ 
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }}
            sort=sort+" "+arr[i];
            }
        System.out.println("The maximum value of array is "+max);
        System.out.println("The minimum value of array is "+min); 
        System.out.println("The sum of array is "+tot);
        System.out.println("The sum of even numbers in array is "+esum);
        System.out.println("The sorted array is: "+sort);
        sc.close();
    }
}