import java.util.Scanner;

public class Task {
	
	public static void main(String args [])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 Marks : ");
		int m1=scan.nextInt();
		int m2=scan.nextInt();
		int m3=scan.nextInt();
		int m4=scan.nextInt();
		int m5=scan.nextInt();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		int t = m1+m2+m3+m4+m5;
		float a = (t/5.0f);
		
		System.out.println("Total : " +t);
		System.out.println("Average : " +a);
		
		scan.close();
				
	}

}
