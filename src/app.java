import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_MVC_CAT?useSSL=false&serverTimezone=UTC&user=root&password=password");
			Statement st = conn.createStatement();
			
			
			DatabaseMetaData dbmd = conn.getMetaData();
			ResultSet ctlgs = dbmd.getCatalogs();
			while(ctlgs.next())
			{
			System.out.println("ctlgs  =  "+ctlgs.getString(1));
			}
			  
			

			
			ResultSet rs = st.executeQuery("select * from produits") ; 
			
			while (rs.next())
			{
				System.out.println(rs.getString("NOM"));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
