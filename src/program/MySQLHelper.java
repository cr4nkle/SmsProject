package program;

import java.sql.*;

public abstract class MySQLHelper {
    private static final String url = "jdbc:mysql://31.31.196.193:3306/u1870328_default";
    private static final String user = "u1870328_default";
    private static final String password = "Zk2pT7PsdADnbt80";

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void init(){
        try{
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void close(){
        try {
            connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public int getCarCount(){
        int count = -1;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select count(*) from cars");
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return count;
    }
}