package com.istad.dataanalyticapi.service.serviceImpl.serviceImpl;

import com.istad.dataanalyticapi.model.User;
import com.istad.dataanalyticapi.repository.UserRepository;
import com.istad.dataanalyticapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
// inject repository
    UserRepository userRepository;
   UserServiceImpl(UserRepository userRepository){
       this.userRepository = userRepository;
   }
    @Override
    public List<User> allUsers() {
        return userRepository.allUsers();
    }

    @Override
    public List<User> findUserByName(String name) {
        return null;
    }

    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public int createNewUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int removeUser(int id) {
        return 0;
    }
}
