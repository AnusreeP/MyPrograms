import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int num1,num2,flag=0;
		int n;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number :");
		n=s.nextInt();
		
		num2=n/2;
		if(n==0 || n==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(num1=2; num1<=num2;num1++)
			{
				if(n%num1==0)
				{
					System.out.println(n+" is not a Prime number");
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0){
			System.out.println(n+ " is a Prime number");
		}
	
	}

}



