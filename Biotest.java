import java.util.Scanner;

public class Biotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		int roll ;
		
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter your name");
		name = s.next();
		System.out.println("Enter your id");
		roll = s.nextInt();
		*/
		
		System.out.println("Press 1 for start to checking.");
		
		int choice = s.nextInt();
		switch(choice)
		{
		case 1 :  	System.out.println("Enter your name  :");
					name = s.next();
					System.out.println("Enter your id    :");
					roll = s.nextInt();			
					if(roll == 1)
					{
						System.out.println("Welcome to anusree");
					
					}
		
					else
					{
						System.out.println("sorry");
					}
					
					System.out.println(name.startsWith("anu"));	
					
					System.out.println("___________________");
					
					
				
		
		case 2 :  	System.out.println("Enter your name  :");
					name = s.next();
					System.out.println("Enter your id    :");
					roll = s.nextInt();
					if(roll == 2)
					{
						System.out.println("Welcome to arya");
					
					}
		
					else
					{
						System.out.println("sorry");
					}
					
					System.out.println(name.startsWith("arya"));
		
					System.out.println("___________________");
					
					
		
		case 3 :    System.out.println("Enter your name   :");
					name = s.next();
					System.out.println("Enter your id     :");
					roll = s.nextInt();
					if(roll == 3)
					{
						System.out.println("Welcome to jini");
					
					}
		
					else
					{
						System.out.println("sorry");
					}
					
					
					System.out.println(name.startsWith("jini"));
					
					System.out.println("_____________________");
					
		
		case 4 :    System.out.println("Enter your name   :");
					name = s.next();
					System.out.println("Enter your id     :");
					roll = s.nextInt();
					if(roll == 4)
					{
						System.out.println("Welcome to nidheesh");
					
					}
		
					else
					{
						System.out.println("sorry");
					}
					
					
					System.out.println(name.startsWith("nidheesh"));
	
					System.out.println("_____________________");
					
		
		case 5 : 	System.out.println("Enter your name   :");
					name = s.next();
					System.out.println("Enter your id     :");
					roll = s.nextInt();
			
					if(roll == 5)
					{
						System.out.println("Welcome to daliya");
					
					}
		
					else
					{
						System.out.println("sorry");
					}
				}
		
		System.out.println(name.startsWith("daliya"));

		System.out.println("______________________");
		
		
	}

}
