import java.util.Scanner;

public class MonthExpence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int salary = 8500;
			int food,traval,accomodation,mfood,mtraval,maccomodation,total,save;
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your Food expence in a day :");
			food = s.nextInt();
			System.out.println("Enter your Traval expence in a day :");
			traval = s.nextInt();
			System.out.println("Enter your Accomodation expence in a day :");
			accomodation = s.nextInt();
			System.out.println("**************************");
			
			
			mfood = 30 * food;
			System.out.println("Monthly food expence          : " + mfood);
			mtraval = 30 * traval;
			System.out.println("Monthly traval expence        : " + mtraval);
			maccomodation = 30 * accomodation;
			System.out.println("Monthly accomodation expence  : " + maccomodation);
			
			total = mfood + mtraval + maccomodation;
			
			System.out.println("Total Expence in a month      : " + total);
			
			save = salary - total;
			System.out.println("Your Savings in this month    : " + save);
			
			
			
	}

}
