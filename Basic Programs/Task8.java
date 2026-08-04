import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = sc.nextInt();
        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;
        int evenNumber = 0, oddNumber = 0;
        int evenPlace = 1, oddPlace = 1;
        int digit =0;
        int rev =0;
    

        while (n > 0) {
            digit =n%10;
            rev= rev*10+digit;


            if (digit % 2 == 0) {
                evenCount++;
                evenSum += digit;
                            evenNumber = digit * evenPlace + evenNumber;

    
                evenPlace *= 10;
            } else {
                oddCount++;
                oddSum += digit;
                oddNumber = digit * oddPlace + oddNumber;
                oddPlace *= 10;
            } 
            n /= 10;
        }

        System.out.println("even number : " + evenNumber);
        System.out.println("odd number : " + oddNumber);
        System.out.println("revers no : "+rev);
        System.out.println("even digit count : " + evenCount);
        System.out.println("odd digit count : " + oddCount);
        System.out.println("sum of even digits : " + evenSum);
        System.out.println("sum of odd digits : " + oddSum); 

        sc.close();
    }
}