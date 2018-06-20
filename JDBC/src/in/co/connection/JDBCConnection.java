package in.co.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

final public class JDBCConnection {

	private JDBCConnection() {

	}

	private static volatile Connection connection = null;
	private static Object mutex = new Object();

	public static Connection getConnection() {

		ResourceBundle rb = ResourceBundle.getBundle("System");

		// JDBCConnection result = connection;

		if (connection == null) {
			synchronized (mutex) {

				// result = connection;

				if (connection == null) {

					try {
						Class.forName(rb.getString("Database.Driver"));
						connection = DriverManager.getConnection(
								rb.getString("Database.url"),
								rb.getString("Database.userId"),
								rb.getString("Database.password"));

					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						System.out.println("Error :: " + e.getMessage());
						System.out.println("Cause ::" + e.getCause());
						System.out.println("SQL State ::" + e.getSQLState());
						System.out.println("Error Code ::" + e.getErrorCode());

					}

					// return connection;

				}

			}

		}
		return connection;

	}

	public static void closeConnection() {

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
