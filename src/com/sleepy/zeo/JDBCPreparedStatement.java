package com.sleepy.zeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCPreparedStatement {

    // 将int值赋值给指定索引的参数
    // public void setInt(int paramIndex, int value)

    // 将String值赋值给指定索引的参数
    // public void setString(int paramIndex, String value)

    // 将float值赋值给指定索引的参数
    // public void setFloat(int paramIndex, float value)

    // 将double值赋值给指定索引的参数
    // public void setDouble(int paramIndex, double value)

    // insert update delete
    // public int executeUpdate()

    // select
    // public ResultSet executeQuery()

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sleepy?useSSL=false&serverTimezone=Asia/Shanghai",
                "root",
                "1994"
        );
        // 预编译sql
        PreparedStatement prepareStatement = connection.prepareStatement("insert into t_user(username,password) values(?,?)");
        // 参数赋值
        prepareStatement.setString(1, "steven");
        prepareStatement.setString(2, "19940911");
        // 执行
        int num = prepareStatement.executeUpdate();
        System.out.println("rows affected: " + num);

        connection.close();
    }
}
