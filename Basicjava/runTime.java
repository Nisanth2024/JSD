import java.util.Scanner;

public class runTime {
	
	public static void main(String args[])
	{
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enetr Customer Name : ");
		 String cname=scan.nextLine();
		 
		 System.out.print("Enter Customer id : ");
		 int id =scan.nextInt();
		 
		 System.out.print("Enter the Amount : ");
		 int amt =scan.nextInt();
		 
		 System.out.print("Your Account Is Valid y/n : ");
		 char av=scan.next().charAt(0);
		 
		 System.out.print("Enter Customer Height : ");
		 float height =scan.nextFloat();
		 
		 System.out.print("Discount price : ");
		 double d =scan.nextDouble();
		 
		 System.out.print("Customer Paid Amount : ");
		 short s =scan.nextShort();
		 
		 System.out.println("Customer Name : " + cname);
		 System.out.println("Customer id : " + id);
		 System.out.println("Fees : " + amt);
		 System.out.println("Is ACcount Valid : " + av);
		 System.out.println("Customer Height : " + height);
		 System.out.println("Discount : " + d);
		 System.out.println("Customer Paid Amount : " + s);
		 scan.close();
		 
	        
	}
	
	

}

