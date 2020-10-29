package com.sleepy.zeo;

import java.sql.*;

public class JDBCSampleApplication {

    public static void main(String[] args) throws Exception {
        // 注册mysql驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 创建mysql连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sleepy?useSSL=false&serverTimezone=Asia/Shanghai",
                "root",
                "1994"
        );
        // 建立statement
        Statement statement = connection.createStatement();
        // 执行查询
        ResultSet resultSet = statement.executeQuery("select * from t_user");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3));
        }
        // 关闭连接
        connection.close();
    }
}
