import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
			
			if(num%2 == 0)
			{
				System.out.println("Even number");
			}
			else{
				System.out.println("Odd number");
			}
	}

}
