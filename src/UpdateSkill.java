import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateSkill {


	private Connection conResume = null;
	private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	private ResultSet rstSki = null;


	public void addSkill(ArrayList<String> listSkills){
		
	
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into skills (SkilId,Skill) values(?,?)"); 
			//System.out.print(pstmtResume);
   
			for (int k = 0; k < listSkills.size()-1; k++){
				pstmtResume.setInt(1, 401);
				pstmtResume.setString(2, listSkills.get(k).toString());
				pstmtResume.addBatch();
		        pstmtResume.executeBatch(); 
		        conResume.commit();
			}  
			}catch  (SQLException e) {
					e.printStackTrace();
			}finally{
   					CloseDBConnection();
					}
	}

		public void DeleteSkill(int AppId){
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM skills WHERE ApplId = '"+ AppId + "'"); 			
			}catch  (SQLException e) {
			
			}finally{
					CloseDBConnection();
					}
   		}
	
	public void CloseDBConnection() {
		try{
			rstSki.close();
			pstmtResume.close();
			conResume.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}