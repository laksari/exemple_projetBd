
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

	// ajout d'un patient (version 1)
	public void insertPatientV(int id, String nom, String prenom) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );

		String str="INSERT INTO PATIENT (id,nom, prenom, version) VALUES ("+id+",'"+nom+"','"+prenom+"',0)";
		//System.out.println(str);
		Statement st=conn.createStatement();
		st.executeUpdate(str);
	}

      

        // ajout d'un patient (version 2)
	public void insertPatientV3(int id, String nom, String prenom) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root" );

	
		PreparedStatement ps=conn.prepareStatement("INSERT INTO PATIENT VALUES (?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, nom);
		ps.setString(3, prenom);
		ps.executeUpdate();
	}

}
