package in.co.statment;

import in.co.connection.JDBCConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelByStatment {

	/*
	 * public Integer nextPK() { int pk = 0; try (Connection conn =
	 * JDBCConnection.getConnection(); Statement stmt = conn.createStatement();)
	 * {// TRY WITH RESOURCE ResultSet rs = stmt
	 * .executeQuery("SELECT MAX(CUSTOMER_ID) FROM CUSTOMER");
	 * 
	 * while (rs.next()) { pk = rs.getInt(1);
	 * 
	 * }
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return pk + 1;
	 * 
	 * }
	 */

	public long addCustomer() {
		int i = 0;

		try (Connection conn = JDBCConnection.getConnection();
				Statement stmt = conn.createStatement();) {

			conn.setAutoCommit(false);
			i = stmt.executeUpdate(" INSERT INTO CUSTOMER (CUSTOMER_ID,FIRST_NAME,LAST_NAME,CITY,BALANCE) VALUES(5,'KRIS','RAO','CHENNAI',500000) ");
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			// conn.rollback();
		}
		return i+1;

	}

	public int updateCustomer() {
		int i = 0;
		try (Connection conn = JDBCConnection.getConnection();
				Statement stmt = conn.createStatement();) {

			i = stmt.executeUpdate(" UPDATE CUSTOMER SET CITY = 'BANGLORE' WHERE CUSTOMER_ID = 1 ");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public int deleteCustomer() {
		int i = 0;
		try (Connection conn = JDBCConnection.getConnection();
				Statement stmt = conn.createStatement();) {
			i = stmt.executeUpdate(" DELETE FROM CUSTOMER WHERE CUSTOMER_ID = 6 ");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public void getCustomer() {

		try (Connection conn = JDBCConnection.getConnection();
				Statement stmt = conn.createStatement();) {

			ResultSet rs = stmt
					.executeQuery(" SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = 4 ");
			if (rs == null) {
				System.out.println("NO RECORD FOUND");
			} else {
				while (rs.next()) {
					System.out.println("CUSTOMER_ID " + rs.getInt(1));
					System.out.println("CUSTOMER_NAME " + rs.getString(2) + " "
							+ rs.getString(3));
					System.out.println("CUSTOMER_CITY " + rs.getString(4));
					System.out.println("CUSTOMER_BALANCE " + rs.getInt(5));

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
