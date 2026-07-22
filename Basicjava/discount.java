import java.util.Scanner;

public class discount {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total Purchase Amount : ");
        double Amount = scan.nextDouble();
        float discount = 0;
        if(Amount >=1000 && Amount <=1999){
            discount = 5;
        }
        else if(Amount >=2000 && Amount <=3999){
            discount = 7;
        }
        else if(Amount >=4000 && Amount <=5999){
            discount = 8;
        }
        else if(Amount >=6000){
            discount = 10;
        }
        else{
            discount = 0;
        }
        System.out.println(" You have " + discount + "% discount");
        double discountAmount = (Amount * discount) / 100;
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("You Have To Pay: " + (Amount - discountAmount));

        scan.close();
    
    }
}
