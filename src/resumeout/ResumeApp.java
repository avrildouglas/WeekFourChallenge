package resumeout;

import java.util.ArrayList;
import java.util.Scanner;


public class ResumeApp {	
	
	  public static void main(String[] args){
		  String fName, lName, eMail;
		  int appId = 0;
		  String answer;
		  boolean result;
		  int appI = 0, edI= 0, expI = 0, skI = 0;
		  
			 
		  ArrayList<String> listEd = new ArrayList();
		  ArrayList<String> listExp = new ArrayList();
		  ArrayList<String> listSkills = new ArrayList();
		  
		  Scanner scanner = new Scanner(System.in);   
		  
		  UpdateApplicant adApp = new UpdateApplicant();
		  UpdateApplicant delApp = new UpdateApplicant();
		  UpdateEducation adEdu = new UpdateEducation();
		  UpdateEducation delEdu = new UpdateEducation();
		  UpdateExperience adExp = new UpdateExperience();
		  UpdateExperience delExp = new UpdateExperience();
		  UpdateSkill adSki = new UpdateSkill();
		  UpdateSkill delSki = new UpdateSkill();


		  System.out.print("Enter your first name: ");
		  fName = scanner.nextLine();

		  System.out.print("Enter your last name: ");
		  lName = scanner.nextLine();
		 
		  do{
				System.out.print("Enter your email: ");
				eMail = scanner.nextLine();
				
				if (eMail == null)
					result = false;
			}while(eMail == null);
		  	
		  	adApp.AddApplicant(fName, lName, eMail);
		//  	delApp.DeleteApplicant(fName);
		  	// delApp.DeleteApplicant(appId);

		  	
		    //Input Education
		  do{  
		        System.out.println("Current Education shows " + listEd);
	            System.out.println("Add more details? (y/n)");
	            Scanner inputEdr = new Scanner(System.in);  
	            answer = inputEdr.next();
	            if (answer.equalsIgnoreCase("y")){
	                System.out.println("Enter Education Details: ");
	                Scanner inputEd = new Scanner(System.in);    
	                String eInput = inputEd.nextLine();
	                listEd.add(eInput);
	                edI++; 
	            	}           
			  } while (answer.equalsIgnoreCase("y")); 
		   
			   adEdu.addEducation(listEd);
			  // delEdu.DeleteEducation(205);
			   
		 //Input Experience
		 do {
	            System.out.println("Current Experience shows " + listExp);
	            System.out.println("Add more details? (y/n)");
	            Scanner inputExpr = new Scanner(System.in);  
	            answer = inputExpr.next();
	            if (answer.equalsIgnoreCase("y")){
	                System.out.println("Enter Experience Details: ");
	                Scanner inputExp = new Scanner(System.in);  
	                String xInput = inputExp.nextLine();
	                listExp.add(xInput);
	                expI++;       
	            }   
	            	  } while (answer.equalsIgnoreCase("y"));
			
			   adExp.addExperience(listExp);
			  
			   System.out.println(listExp);
			//   delExp.DeleteExperience(305);
    
			   
			//Input Skills
	        do {
	            System.out.println("Current Skills shows " + listSkills);
	            System.out.println("Add more details? (y/n)");
	            Scanner inputSkr = new Scanner(System.in);  
	            answer = inputSkr.next();
	            if (answer.equalsIgnoreCase("y")){
	            	System.out.println("Enter Skills Details: ");
	                Scanner inputSkills = new Scanner(System.in);  
	                String sInput = inputSkills.nextLine();
	                listSkills.add(sInput);
	                skI++; 
	            }   
			  } while (answer.equalsIgnoreCase("y"));
	     
	        	adSki.addSkill(listSkills);
	        //	delSki.DeleteSkill(405);
	   } 
	}

