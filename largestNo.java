import java.util.Scanner;

public class largestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the First number:");
		a=s.nextInt();
		System.out.println("Enter the Second number:");
		b=s.nextInt();
		System.out.println("Enter the Third number:");
		c=s.nextInt();
		if(a>b&a>c)
		{
				System.out.println("Largest Number is:" + a);
			
		}
		else if(b>a & b>c)
		{
			System.out.println("Largest Number is:" + b);
		}
		else
		{
			System.out.println("Largest Number is:" +c);
		}
	
	}

}
