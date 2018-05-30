import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Enter first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Enter second number: ");
		  int num2 = in.nextInt();
		   
		  System.out.print("Enter third number: ");
		  int num3 = in.nextInt();  
		  System.out.println("Average of given numbers is: " +  (num1 + num2 + num3 ) / 3);
		
	}

}
