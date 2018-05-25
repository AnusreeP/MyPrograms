import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number");
		a=s.nextInt();
		System.out.println("Enter the Second number");
		b=s.nextInt();
		num=a;
		a=b;
		b=num;
		System.out.println("Swaping Number is: \n"  +a+ "\n" +b);

	}

}
