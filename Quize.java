package com.javacodegeeks.snippets.desktop;

import java.util.Scanner;

public class Quize {

	/*public static void main(String[] args) {*/
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
		    String[] multiChoice1;
		    Scanner input = new Scanner(System.in);

		    multiChoice1 = new String[5];
		    multiChoice1[0] = "1. Which is the National Technology day in India?\n";
		    multiChoice1[1] = "";
		    multiChoice1[2] = "";
		    multiChoice1[3] = "";
		    multiChoice1[4] = "";

		    String choice1 = multiChoice1[0];

		    if(choice1==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. May 8");
		        System.out.println("B. May 11");
		        System.out.println("C. May 15");
		        System.out.println("D. May 19");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String Select1 = input.next();

		        switch (Select1.toUpperCase()){
		            case "A":
		                Select1 = "May 8";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		                Select1 = "May 11";
		                System.out.println("Correct!\n\n");
					    break;
		            case "C":
		                Select1 = "May 15";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		                Select1 = "May 19";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		                Select1 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }
		    
		    
		    multiChoice1 = new String[5];
		    multiChoice1[0] = "2. Which is the longest river in the world?\n";
		    multiChoice1[1] = "";
		    multiChoice1[2] = "";
		    multiChoice1[3] = "";
		    multiChoice1[4] = "";

		    String choice2 = multiChoice1[0];

		    if(choice2==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Nile");
		        System.out.println("B. Brahmaputra");
		        System.out.println("C. Periyar");
		        System.out.println("D. Kaveri");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String Select2 = input.next();

		        switch (Select2.toUpperCase()){
		            case "A":
		            	Select2 = "Nile";
		                System.out.println("Correct!\n\n");
		                break;
		            case "B":
		            	Select2 = "Nila";
		                System.out.println("Incorrect!\n\n");
					    break;
		            case "C":
		            	Select2 = "Periyar";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		            	Select2 = "Chaliyar";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		            	Select2 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }


		    multiChoice1 = new String[5];
		    multiChoice1[0] = "3. The official language of Kerala ?\n";
		    multiChoice1[1] = "";
		    multiChoice1[2] = "";
		    multiChoice1[3] = "";
		    multiChoice1[4] = "";

		    String choice3 = multiChoice1[0];

		    if(choice3==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Malayalam");
		        System.out.println("B. English");
		        System.out.println("C. Tamil");
		        System.out.println("D. Hindi");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String Select3 = input.next();

		        switch (Select3.toUpperCase()){
		            case "A":
		            	Select3 = "Malayalam";
		                System.out.println("Correct!\n\n");
		                break;
		            case "B":
		            	Select3 = "English";
		                System.out.println("Incorrect!\n\n");
					    break;
		            case "C":
		            	Select3 = "Tamil";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		            	Select3 = "Hindi";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		            	Select3 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }

		    
		    
	 

		    multiChoice1 = new String[5];
		    multiChoice1[0] = "4. Which state became the first ‘Complete Digital State‘ in India ?\n";
		    multiChoice1[1] = "";
		    multiChoice1[2] = "";
		    multiChoice1[3] = "";
		    multiChoice1[4] = "";

		    String choice4 = multiChoice1[0];

		    if(choice4==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Tamilnadu");
		        System.out.println("B. Gujarat");
		        System.out.println("C. Kerala");
		        System.out.println("D. Andhra");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String Select4 = input.next();

		        switch (Select4.toUpperCase()){
		            case "A":
		            	Select4 = "Tamilnadu";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		            	Select4 = "Gujarat";
		                System.out.println("Incorrect!\n\n");
					    break;
		            case "C":
		            	Select4 = "Kerala";
		                System.out.println("Correct!\n\n");
		                break;
		            case "D":
		            	Select4 = "Andhra";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		            	Select4 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }

		    
		    multiChoice1 = new String[5];
		    multiChoice1[0] = "5. Where is the Kerala High Court located at?\n";
		    multiChoice1[1] = "";
		    multiChoice1[2] = "";
		    multiChoice1[3] = "";
		    multiChoice1[4] = "";

		    String choice5 = multiChoice1[0];

		    if(choice5 ==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Calicut");
		        System.out.println("B. Malappuram");
		        System.out.println("C. Kannur");
		        System.out.println("D. Kochi");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String Select5 = input.next();

		        switch (Select5.toUpperCase()){
		            case "A":
		            	Select5 = "Calicut";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		            	Select5 = "Malappuram";
		                System.out.println("Incorrect!\n\n");
					    break;
		            case "C":
		            	Select5 = "Kannur";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		            	Select5 = "Kochi";
		                System.out.println("Correct!\n\n");
		                break;
		            default: 
		            	Select5 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }
  
		    
		    
		    
		}

	}


