
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;

//import java.sql.Statement;

import java.util.Scanner;


public class ResumeApp {	
	
	  public static void main(String[] args){
		  String fName, lName, eMail;
		  String Education;
		  String Experience;
		  String Skills;
		  String answer;
		  boolean result;
		  int edI= 0, expI = 0, skI = 0;
		  
			 
		  ArrayList<String> listEd = new ArrayList();
		  ArrayList<String> listExp = new ArrayList();
		  ArrayList<String> listSkills = new ArrayList();
		  
		  Scanner scanner = new Scanner(System.in);   
		  
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
		  
		  AddResumeData adApp = new AddResumeData();
		  adApp.AddApplicant(fName, lName, eMail);
	  
	}
}