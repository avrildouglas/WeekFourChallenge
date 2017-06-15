import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateExperience {


	private Connection conResume = null;
	private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	private ResultSet rstExp = null;


	public void addExperience(ArrayList<String> listExp){
		
	
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into experience(ExpeId,Experience) values(?,?)"); 
			//System.out.print(pstmtResume);
   
			for (int k = 0; k < listExp.size()-1; k++){
				pstmtResume.setInt(1, 301);
				pstmtResume.setString(2, listExp.get(k).toString());
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

		public void DeleteExperience(int AppId){
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM experience WHERE ApplId = '"+ AppId + "'"); 			
			}catch  (SQLException e) {
			
			}finally{
					CloseDBConnection();
					}
   		}
	
	public void CloseDBConnection() {
		try{
			rstExp.close();
			pstmtResume.close();
			conResume.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	

}