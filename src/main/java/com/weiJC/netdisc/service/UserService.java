package com.weiJC.netdisc.service;

import com.weiJC.netdisc.dao.UserDao;
import com.weiJC.netdisc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User getUserById(String id){
        User user = userDao.getUserById(id);
        return user;
    }
    public User getUserByIdAndPassword(String id, String password){
        User user = userDao.getUserByIdAndPassword(id, password);
        return user;
    }

    public int addUser(User user){
        int i = userDao.addUser(user);
        return i;
    }

    public int deleteUser(String id){
        int i = userDao.deleteUser(id);
        return i;
    }

    public int updateUser(User user){
        int i = userDao.updateUser(user);
        return i;
    }

    public int updateMsg(String id, String username, String email){
        int i = userDao.updateMsg(id, username, email);
        return i;
    }


    public int resetPassword(String id, String password){
        int i = userDao.resetPassword(id, password);
        return i;
    }
}
