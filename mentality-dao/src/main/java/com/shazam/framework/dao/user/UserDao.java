package com.shazam.framework.dao.user;

import com.shazam.framework.entity.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {


    @Query("select u from User u where u.userName = :username or u.password = :password")
    User findUserByUserNameAndPassword(String username,String password);

}
