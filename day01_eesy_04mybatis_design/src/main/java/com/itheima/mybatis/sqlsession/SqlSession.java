package com.itheima.mybatis.sqlsession;

/**
 *
 * 自定义Mybatis中和数据库交互的核心类
 *  它里面可以创建dao接口的代理对象
 */
public interface SqlSession {

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    //<T> T:这个位置为什么只写后面个T为什么会报错，因为泛型要求先声明再使用，声明在返回值（第二个T）之前
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
