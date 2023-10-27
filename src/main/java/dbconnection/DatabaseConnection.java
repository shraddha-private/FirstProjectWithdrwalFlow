package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

	public static String db_otp;
	public static Connection con = null;
	public static Statement stmt = null;
	public String URL = "jdbc:mysql://impactguru-staging-rds-server.cmvyxw6hpw8z.ap-south-1.rds.amazonaws.com:3306/impactguru_live_uat";
	public String UN = "impact_lshraddha";
	public String PS = "P7yG,]mY6)sNs*./";

	public String databaseConnection(String Query) throws Exception {

		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		Class.forName(JDBC_DRIVER);
		con = DriverManager.getConnection(URL, UN, PS);
		stmt = con.createStatement();
		System.out.println("Database connection established");
		ResultSet rs = stmt.executeQuery(Query);
		while (rs.next()) {
			db_otp = rs.getString("otp");
			System.out.println("under method" + db_otp);
		}
		return db_otp;

	}

}
