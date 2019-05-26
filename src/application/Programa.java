package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		

		try {


			conn = DB.getConnection();
			/*	st = conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+	"VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Carlos Oliveira");
			st.setString(2, "Carlos@outlook.com");
			st.setDate(3, new  java.sql.Date(sdf.parse("19/04/1996").getTime()));
			st.setDouble(4, 3500.00);
			st.setInt(5, 4);
			
			*/
			st = conn.prepareStatement(
					"DELETE FROM seller "
					+"WHERE "
					+"Id = ?");
				st.setInt(1, 8);
			
			int linhas = st.executeUpdate();
		}
		catch (SQLException e) {

			e.printStackTrace();

		} 

		finally {

			DB.closeStatement(st);

			DB.closeConnection();

		}



}
}