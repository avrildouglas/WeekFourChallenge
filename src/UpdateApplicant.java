import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateApplicant {

	private Connection conResume = null;
	private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	private ResultSet rstApp = null;


	public void AddApplicant(String appfName, String applName, String appeMail){
		//System.out.printf(applName, appeMail);
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into applicant(ApplId,FirstName,LastName, Email) values(?,?,?,?)"); 
			//System.out.print(pstmtResume);
   
			pstmtResume.setInt(1,101); 
			pstmtResume.setString(2,appfName);
			pstmtResume.setString(3,applName);
			pstmtResume.setString(4,appeMail);
			pstmtResume.executeUpdate();
			
			}catch  (SQLException e) {
					e.printStackTrace();
			}finally{
   					CloseDBConnection();
					}
	}

		public void DeleteApplicant(int AppId){
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM applicant WHERE ApplId = '"+ AppId + "'"); 
			System.out.println(pstmtResume);
   
		//	pstmtResume.setInt(1,105); 
			
		//	pstmtResume.executeUpdate();
			
			}catch  (SQLException e) {
			
			}finally{
					CloseDBConnection();
					}
   		}
	
	public void CloseDBConnection() {
		try{
			rstApp.close();
			pstmtResume.close();
			conResume.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
