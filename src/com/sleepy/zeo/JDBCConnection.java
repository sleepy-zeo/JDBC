package com.sleepy.zeo;

public class JDBCConnection {

    // 创建一个可用于执行sql语句的Statement对象
    // public Statement createStatement()

    // 创建一个可用于执行sql语句的Statement对象
    // @resultType: 结果集滚动类型
    //      TYPE_FORWARD_ONLY 缺省类型。只允许向前访问一次，不会受到其他用户对该数据库所作更改的影响
    //      TYPE_SCROLL_INSENSITIVE 允许在列表中向前或向后移动，不会受到其他用户对该数据库所作更改的影响
    //      TYPE_SCROLL_SENSITIVE 允许在列表中向前或向后移动，会受到其他用户对该数据库所作更改的影响
    // @resultSetConcurrency: 是否为可以更新的结果集
    //      CONCUR_READ_ONLY 缺省值
    //      CONCUR_UPDATABLE
    // public Statement createStatement(int resultSetType, int resultSetConcurrency)

    // 设置事务是否自动提交，默认为true
    // public void setAutoCommit(boolean status)

    // 提交事务
    // public void commit()

    // 回滚事务
    // public void rollback()

    // 关闭连接
    // public void close()
}
