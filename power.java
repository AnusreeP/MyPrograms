import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter your number:");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		System.out.println("Square of the number is:         " + Math.pow(num,2));
		System.out.println("Square root of the number is:    " +Math.sqrt(num));
		System.out.println("Cube of the number is:           " +Math.pow(num,3));
		
	}

}
