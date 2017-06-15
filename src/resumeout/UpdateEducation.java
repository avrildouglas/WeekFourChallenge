package resumeout;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UpdateEducation {

	private Connection conResume = null;
	//private Statement stmtResume = null;
	private PreparedStatement pstmtResume = null;
	//private ResultSet rstEdu = null;


	public void addEducation(ArrayList<String> listEd){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("Insert into education(Education) values(?)"); 
	   
			for (int k = 0; k < listEd.size()-1; k++){
			//	pstmtResume.setInt(1, 201);
				pstmtResume.setString(1, listEd.get(k).toString());
				pstmtResume.addBatch();
		        pstmtResume.executeBatch(); 
		       // conResume.commit();
			}
			}catch  (SQLException e) {
					e.printStackTrace();
			}catch (ClassNotFoundException e){
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

		public void DeleteEducation(int AppId){
		try{
			// 	Class.forName("com.mysql.jdbc.Driver");
			conResume = DriverManager.getConnection("jdbc:mysql://localhost/resume?"
							+ "user=root&password=password");

			pstmtResume = conResume.prepareStatement("DELETE FROM education WHERE ApplId = '"+ AppId + "'"); 			
			}catch  (SQLException e) {
			
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
