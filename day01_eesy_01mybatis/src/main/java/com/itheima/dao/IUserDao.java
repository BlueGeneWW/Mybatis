package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 *
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
