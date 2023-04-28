package com.istad.dataanalyticapi.repository;

import com.istad.dataanalyticapi.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {

    @Select("select * from users_tb")
    @Result(column = "id", property = "userId")
    List<User> allUsers();
    List<User> findUserByUsername(String username);
    int createNewUser(User user);
    int updateUser(User user);
    @Insert("bank_db> insert into users_tb ( username, gender, address)\n" +
            "         values (#{user.username},#{user.gender},#{user.address})")

    User findUserById(int id);

    @Result(property = "userId", column = "id")
    @Select("select  * from users_tb where id = #{id}")
    User findUserByID(int id );
    int removeUser(int id );
}
