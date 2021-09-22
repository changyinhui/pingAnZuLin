package pingAnZuLin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDemo{
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
//    private static final String DRIVER = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/databasename1";

//    //定义数据库的连接
//    private static Connection connection;
//    //SQL语句的执行对象
//    private static PreparedStatement prepareStatement;
//    //返回的结果集
//    private static ResultSet resultSet;

    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/databasename1";

    //定义数据库的连接
    private static Connection connection;
    //SQL语句的执行对象
    private static PreparedStatement preparedStatement;
    //返回的结果集
    private static ResultSet resultSet;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        //使用事务，设置为手动提交
        connection.setAutoCommit(false);
        //设置事务隔离级别
        connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);

        try{
            String sql = "insert into userinfo(username,password) values (?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"Tom");
            preparedStatement.setString(2,"123");
            preparedStatement.executeUpdate();

            connection.commit();
        }catch (Exception e){
            connection.rollback();
        }finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
    }
}