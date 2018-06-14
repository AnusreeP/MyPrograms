import java.util.Scanner;

public class Workshop1 {
	static int qty;
	static int type;
	static int charge;
	int expence;
	static int type1;
	static int type2;
	static int tyer;
	static String name;
	static int charge1= 500;
	static int charge2= 1000;
	static int expence1 = 100;
	static int expence2 = 200;
	static int totalexpence;
	static int profit;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner s = new Scanner (System.in);
		System.out.println("Enter your vehicle name:");
		name = s.next();
		System.out.println("Enter your choice : 1. Two Wheel    2. Four Wheel");
		type = s.nextInt();
		switch( type )
	    {
	       		
		case 1 :   System.out.println("You are successfully selected 2 Wheel !");
				   break;
				 
		case 2 :   System.out.println("You are successfully selected 4 Wheel !");
				   break;
			default:
				System.out.println("Sorry Defult input , please check again... ");
				break;
	    }
		System.out.println(" ");
		System.out.println("Number of items for Service :");
		qty= s.nextInt();
		
		System.out.println("********************");
		
		switch(type)
		{
		case 1 : 	charge1=charge1 * qty;
					System.out.println("Service Charge for 2 Wheel       :" + charge1 );
					expence1 = 200;
					System.out.println("Service Expence                  : " + expence1);
					totalexpence = expence1 * qty;
					System.out.println("Total Service expence            :" + totalexpence );
					profit = charge1 - totalexpence;
					System.out.println("Total Profit                     :" + profit);
					
					
					
					break;
		case 2 : 	charge2= charge2 *qty;
					System.out.println("Service Charge for 4 Wheel        :" + charge2);
					expence2 = 400;
					System.out.println("Service Expence                   :" + expence2);
					totalexpence = expence2 * qty;
					System.out.println("Total Service expence             :" + totalexpence );
					profit = charge2 - totalexpence;
					System.out.println("Total Profit                      :" + profit);
			
			}
		
		
		
		
		
		
	}

}
