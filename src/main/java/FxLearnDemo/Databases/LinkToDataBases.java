package FxLearnDemo.Databases;
import java.sql.*;

/*
这是一个负责存放注册数据的数据库

 */
public class LinkToDataBases {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //  2.获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1", "root", "12345");
            //3.获取操作数据库的工具
            sta = connection.createStatement();//操作数据库就需要这个sta
            //4.操作数据库
            String sql = "select * from worker";
            //String sql1="delete from emp where ename='hello'";
            //查询用executeQuery//更新语句用executeUpdate
            rs = sta.executeQuery(sql);
            // 5.处理结果集
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString("JOB"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.关闭资源
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (sta != null) {
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
