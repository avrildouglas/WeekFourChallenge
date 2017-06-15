package resumeout;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateApplicant {

	private Connection conResume = null;
	//private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	private ResultSet rstApp = null;
	
	public void AddApplicant(String appfName, String applName, String appeMail){
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into applicant(FirstName,LastName, Email) values(?,?,?)"); 
   
			//pstmtResume.setInt(1,10); 
			pstmtResume.setString(1,appfName);
			pstmtResume.setString(2,applName);
			pstmtResume.setString(3,appeMail);
			pstmtResume.executeUpdate();
			
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch  (ClassNotFoundException e) {
				e.printStackTrace();
			}
		finally{
			try{		
				pstmtResume.close();
				conResume.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			}
    	}

		public void DeleteApplicant(int AppId){
		try{
				Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM applicant WHERE ApplId = '"+ AppId + "'"); 
			System.out.println(pstmtResume);			
			}catch  (SQLException e) {
				e.printStackTrace();
			}catch  (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				try{		
					pstmtResume.close();
					conResume.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				}
   		}	
}
