import java.util.Scanner;
public class controlst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 Mark : ");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m4 = scan.nextInt();
        int m5 = scan.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        float average =  total / 5.0f;
        String result ="";
        if(m1 > 34 && m2 > 34 && m3 > 34 && m4 > 34 && m5 > 34) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println("Total Marks : " + total);
        System.out.println("Average Marks : " + average);
        if(result == "Pass") {
             if(average >= 85) {
                System.out.println("Excellent");
            } else if(average >= 75) {
                System.out.println("Very Good");
            } else if(average >= 65) {
                System.out.println("Good");
            } else if(average >= 55) {
                System.out.println("Fair");
            }
            else if(average >= 35) {
                System.out.println("Needs Improvement");
            }
        }
        else {
            System.out.println("No Grade becacuse You are Fail. So Study Well!!");
        }

       
        
            
        scan.close();
    }
}
