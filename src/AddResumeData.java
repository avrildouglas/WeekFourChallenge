import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AddResumeData {
	
	
	public void AddApplicant(String appfName, String applName, String appeMail){
		Connection conResume = null;
		Statement stmtResume = null;
		PreparedStatement pstmtResume = null;
		ResultSet rst = null;
		String appUpdSQL = "insert into Applicant(ApplId,FirstName,LastName, Email) values(?,?,?,?)";
		System.out.print(appUpdSQL);

	   try{
		  // 	Class.forName("com.mysql.jdbc.Driver");
		   	conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
								+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement(appUpdSQL);
	   
			pstmtResume.setInt(1,103); 
			pstmtResume.setString(2,appfName);
			pstmtResume.setString(3,applName);
			pstmtResume.setString(4,appeMail);
			rst=pstmtResume.executeQuery();

	   }	catch  (SQLException e) {
					e.printStackTrace();
	   			}
	   		finally{
	   				try{
	   					rst.close();
	   					pstmtResume.close();
	   					conResume.close();
	   				}catch(SQLException e){
	   						e.printStackTrace();
	   				}
	   	
	   		}
	   			
	   		}
	

/**public void AddEducation(ArrayList<String> EdEducation) {

	String updEducation = "insert into Education(EducId, Education) values(?,?)";

	try{
	//	  	Class.forName("com.mysql.jdbc.Driver");
		  	conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
								+ "user=root&password=password");
			stmtResume = conResume.prepareStatement(updEducation);		  
			stmtResume.setInt(1,101); 
			stmtResume.setString(2,EdEducation.toString());
			stmtResume.executeUpdate();
	  }	catch  (SQLException e) {
					e.printStackTrace();
	  			}
	  		finally{
	  			try{	 
  					rsEducation.close();
  					conResume.close();
  				}catch(SQLException e){
  					e.printStackTrace();
  				}			
	  			
	  		}
  }*/















/**	  String sqlEducation = "select * from Education";
  String sqlExperience = "select * from Experience";
  String sqlSkills = "select * from Skills";*/
  

		/**try{
			
		
	  		  
		//		rsApplicant = stmtResume.executeQuery(sqlApplicant);

	
				stmtResume = conResume.prepareStatement(sqlEducation);
				rsEducation = stmtResume.executeQuery(sqlEducation);
				stmtResume = conResume.prepareStatement(sqlExperience);
				rsExperience = stmtResume.executeQuery(sqlExperience);
				stmtResume = conResume.prepareStatement(sqlSkills);
				rsSkills = stmtResume.executeQuery(sqlSkills);
				while(rsApplicant.next()){
					System.out.println("Hello");
				}

				}catch (SQLException e) {
						e.printStackTrace();
				}catch (ClassNotFoundException e){
						e.printStackTrace();
  		}	finally{
  			
  				try{
  					rsApplicant.close();
  					rsEducation.close();
  					rsExperience.close();
  					rsSkills.close();
  				}catch(SQLException e){
  					e.printStackTrace();
  				}			
		}*/	  
}

  
/**		  for (?? : ??.getSubs()) {
  System.out.println();
  
  for (E?? ?? : ??.getSubordinates()) {
     System.out.println(??);
  }
}		
}
}*/


