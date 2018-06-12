import java.util.Scanner;

public class ShoppingMall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int items = 0;
		
		int qty,gst=3,gtotal;
		int total,price=5;
		Scanner s = new Scanner (System.in);
		System.out.println("Enyter your Item :" );
		name = s.next();
		System.out.println("Number of Items :");
		qty=s.nextInt();
		System.out.println("");
		/*System.out.println("Item           :" +name);*/
		System.out.println("Quantity       :" +qty);
		System.out.println("GST            :" +gst);
		total=qty*price;
		gtotal=gst+total;
		System.out.println("Total          :" + total );
		System.out.println("Grand Total    :" + gtotal );
		
		
	}

}
