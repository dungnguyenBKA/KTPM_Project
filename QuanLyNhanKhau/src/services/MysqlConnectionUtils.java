package services;

import java.sql.*;
/**
 *
 * @author Dung
 */
public class MysqlConnectionUtils {
    public static Connection getMysqlConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String dbName = "quan_ly_nhan_khau";
        String userName = "root";
        String password = "123456";

        return getMysqlConnection(hostName, dbName, userName, password);
    }
    
    public static Connection getMysqlConnection(String hostName, String dbName, String userName, String password) 
        throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
        return DriverManager.getConnection(connectionUrl, userName, password);
    }
}
