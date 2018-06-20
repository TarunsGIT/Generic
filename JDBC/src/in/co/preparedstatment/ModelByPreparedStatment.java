package in.co.preparedstatment;

import in.co.connection.JDBCConnection;
import in.co.javabean.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelByPreparedStatment {

	public int nextPK() {

		int pk = 0;
		try {
			Connection conn = JDBCConnection.getConnection();
			System.out.println(JDBCConnection.getConnection());
			PreparedStatement pstmt = conn
					.prepareStatement("SELECT MAX(CUSTOMER_ID) FROM CUSTOMER");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pk + 1;

	}

	public int addCustomer(CustomerDTO DTO) {

		int pk = 0;
		int result = 0;
		// Connection conn;
		try (Connection conn = JDBCConnection.getConnection();
				PreparedStatement pstmt = conn
						.prepareStatement("INSERT INTO CUSTOMER VALUES (?,?,?,?,?)");) {
			System.out.println(JDBCConnection.getConnection());
			pk = nextPK();
			conn.setAutoCommit(false);
			pstmt.setInt(1, pk);
			pstmt.setString(2, DTO.getFirstName());
			pstmt.setString(3, DTO.getLastName());
			pstmt.setString(4, DTO.getCity());
			pstmt.setDouble(5, DTO.getBalance());
			result = pstmt.executeUpdate();
			conn.commit();
			if (result == 0) {
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pk;

	}

	public void updateCustomer(CustomerDTO dto) {

		try (Connection conn = JDBCConnection.getConnection();
				PreparedStatement pstmt = conn
						.prepareStatement("UPDATE CUSTOMER SET FIRST_NAME=?,LAST_NAME=?,CITY=?,BALANCE=? WHERE CUSTOMER_ID=?");) {

			conn.setAutoCommit(false);
			pstmt.setString(1, dto.getFirstName());
			pstmt.setString(2, dto.getLastName());
			pstmt.setString(3, dto.getCity());
			pstmt.setDouble(4, dto.getBalance());
			pstmt.setLong(5, dto.getCustomer_ID());
			int i = pstmt.executeUpdate();
			conn.commit();
			if (i > 0) {
				System.out.println("RECORD UPDATED--> " + i);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteCustomer(CustomerDTO dto) {
		try (Connection conn = JDBCConnection.getConnection();
				PreparedStatement pstmt = conn
						.prepareStatement(" DELETE FROM CUSTOMER WHERE CUSTOMER_ID=? ");) {
			conn.setAutoCommit(false);
			pstmt.setLong(1, dto.getCustomer_ID());
			int i = pstmt.executeUpdate();
			conn.commit();
			if (i > 0) {
				System.out.println("RECORD DELETED AT--> " + i);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public CustomerDTO findByPk(long pk) {

		CustomerDTO dto = null;
		try (Connection conn = JDBCConnection.getConnection();
				PreparedStatement pstmt = conn
						.prepareStatement(" SELECT * FROM CUSTOMER WHERE CUSTOMER_ID=? ");) {
			pstmt.setLong(1, pk);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new CustomerDTO();
				dto.setCustomer_ID(rs.getLong(1));
				dto.setFirstName(rs.getString(2));
				dto.setLastName(rs.getString(3));
				dto.setCity(rs.getString(4));
				dto.setBalance(rs.getDouble(5));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;

	}
}
