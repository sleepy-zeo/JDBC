package com.sleepy.zeo;

public class JDBCTransaction {

    // 事务代表一个工作单元，有四个特性:
    // 原子性: 操作全部成功或全部失败
    // 一致性: 确保将数据库从一种一致状态带到另一种一致状态
    // 隔离性: 确保事务与其他事务隔离
    // 持久性: 是指事务一旦提交，将保持不变

    // 设置事务是否自动提交，默认为true
    // void setAutoCommit(boolean status)

    // 提交事务
    // void commit()

    // 回滚事务
    // void rollback()
}
