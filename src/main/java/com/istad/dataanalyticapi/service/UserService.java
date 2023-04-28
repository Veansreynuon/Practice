package com.istad.dataanalyticapi.service;

import com.istad.dataanalyticapi.model.User;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    List<User> findUserByName(String name);
    User findUserById(int id);
    int createNewUser(User user);
    int updateUser(User user);
    int removeUser(int id);
}
