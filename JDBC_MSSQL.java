// java with SSMS
import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
class JDBC_MSSQL
{
	public static void main(String args[])
	{
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		PreparedStatement ps;

		try {
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setServerName("localhost");
			ds.setPortNumber(1433); 
			ds.setDatabaseName("training");
			con = ds.getConnection();

			ps = con.prepareStatement("select * from students");
	    	rs = ps.executeQuery();
			 
			while(rs.next()) 
			{
	        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));	
	        }
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace(); 
	    	}

	   	finally{
	    		if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (cstmt != null) try { cstmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
	    	}
	}
}
