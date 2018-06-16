import java.util.Scanner;

public class ShoppingMall {
	
	public static void main(String[] args) 
	{
		String name;
		int items = 0;
		
		int qty;
		Scanner s = new Scanner (System.in);
		System.out.println("Enyter your Item :" );
		name = s.next();
		System.out.println("Price:");
		double price = s.nextInt();
		System.out.println("Number of Items :");
		qty=s.nextInt();
		System.out.println("");
		System.out.println("Quantity       :" +qty);
		
		double total=qty*price;
		System.out.println("Total          :" +total);
		
		double gst= (total*5)/100;	
		System.out.println("Gst            :" + gst );
		
		double gtotal=gst+total;
		System.out.println("Grand Total    :" + gtotal );
		
		
	}

}
