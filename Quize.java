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
		    multiChoice1[1] = "blah blah";
		    multiChoice1[2] = "blah blah";
		    multiChoice1[3] = "blah blah";
		    multiChoice1[4] = "blah blah";

		    String userSelect1 = multiChoice1[0];

		    if(userSelect1==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. May 8");
		        System.out.println("B. May 11");
		        System.out.println("C. May 15");
		        System.out.println("D. May 19");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String uSelect1 = input.next();

		        switch (uSelect1.toUpperCase()){
		            case "A":
		                uSelect1 = "May 8";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		                uSelect1 = "May 11";
		                System.out.println("Correct!\n\n");
					int scorePro = 0;
					scorePro++;
					int score = 0;
					score++;
		                break;
		            case "C":
		                uSelect1 = "May 15";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		                uSelect1 = "May 19";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		                uSelect1 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }
		    
		    
		    multiChoice1 = new String[5];
		    multiChoice1[0] = "2. Which is the longest river in the world?\n";
		    multiChoice1[1] = "blah blah";
		    multiChoice1[2] = "blah blah";
		    multiChoice1[3] = "blah blah";
		    multiChoice1[4] = "blah blah";

		    String userSelect11 = multiChoice1[0];

		    if(userSelect11==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Nile");
		        System.out.println("B. Brahmaputra");
		        System.out.println("C. Periyar");
		        System.out.println("D. Kaveri");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String uSelect11 = input.next();

		        switch (uSelect11.toUpperCase()){
		            case "A":
		                uSelect11 = "Nile";
		                System.out.println("Correct!\n\n");
		                break;
		            case "B":
		                uSelect11 = "Nila";
		                System.out.println("Incorrect!\n\n");
					int scorePro = 0;
					scorePro++;
					int score = 0;
					score++;
		                break;
		            case "C":
		                uSelect11 = "Periyar";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		                uSelect11 = "Chaliyar";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		                uSelect11 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }

		   
		    
		    
		    multiChoice1 = new String[5];
		    multiChoice1[0] = "3. The official language of Kerala ?\n";
		    multiChoice1[1] = "blah blah";
		    multiChoice1[2] = "blah blah";
		    multiChoice1[3] = "blah blah";
		    multiChoice1[4] = "blah blah";

		    String userSelect12 = multiChoice1[0];

		    if(userSelect12==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Malayalam");
		        System.out.println("B. English");
		        System.out.println("C. Tamil");
		        System.out.println("D. Hindi");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String uSelect12 = input.next();

		        switch (uSelect12.toUpperCase()){
		            case "A":
		                uSelect12 = "Malayalam";
		                System.out.println("Correct!\n\n");
		                break;
		            case "B":
		                uSelect12 = "English";
		                System.out.println("Incorrect!\n\n");
					int scorePro = 0;
					scorePro++;
					int score = 0;
					score++;
		                break;
		            case "C":
		                uSelect12 = "Tamil";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		                uSelect12 = "Hindi";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		                uSelect12 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }

		    
		    
	 

		    multiChoice1 = new String[5];
		    multiChoice1[0] = "4. Which state became the first ‘Complete Digital State‘ in India ?\n";
		    multiChoice1[1] = "blah blah";
		    multiChoice1[2] = "blah blah";
		    multiChoice1[3] = "blah blah";
		    multiChoice1[4] = "blah blah";

		    String userSelect13 = multiChoice1[0];

		    if(userSelect13==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Tamilnadu");
		        System.out.println("B. Gujarat");
		        System.out.println("C. Kerala");
		        System.out.println("D. Andhra");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String uSelect13 = input.next();

		        switch (uSelect13.toUpperCase()){
		            case "A":
		                uSelect13 = "Tamilnadu";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		                uSelect13 = "Gujarat";
		                System.out.println("Incorrect!\n\n");
					int scorePro = 0;
					scorePro++;
					int score = 0;
					score++;
		                break;
		            case "C":
		                uSelect13 = "Kerala";
		                System.out.println("Correct!\n\n");
		                break;
		            case "D":
		                uSelect13 = "Andhra";
		                System.out.println("Incorrect!\n\n");
		                break;
		            default: 
		                uSelect13 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }

		    
		    multiChoice1 = new String[5];
		    multiChoice1[0] = "5. Where is the Kerala High Court located at?\n";
		    multiChoice1[1] = "blah blah";
		    multiChoice1[2] = "blah blah";
		    multiChoice1[3] = "blah blah";
		    multiChoice1[4] = "blah blah";

		    String userSelect14 = multiChoice1[0];

		    if(userSelect14 ==multiChoice1[0]){
		        System.out.println(multiChoice1[0]);
		        System.out.println("A. Calicut");
		        System.out.println("B. Malappuram");
		        System.out.println("C. Kannur");
		        System.out.println("D. Kochi");
		        System.out.println();
		        System.out.print("Your answer: ");
		        String uSelect14 = input.next();

		        switch (uSelect14.toUpperCase()){
		            case "A":
		                uSelect14 = "Calicut";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "B":
		                uSelect14 = "Malappuram";
		                System.out.println("Incorrect!\n\n");
					int scorePro = 0;
					scorePro++;
					int score = 0;
					score++;
		                break;
		            case "C":
		                uSelect14 = "Kannur";
		                System.out.println("Incorrect!\n\n");
		                break;
		            case "D":
		                uSelect14 = "Kochi";
		                System.out.println("Correct!\n\n");
		                break;
		            default: 
		                uSelect14 = "Incorrect, choice.\n\n";
		                break;
		        }
		    }
  
		    
		}

	}


