package dao;

import domain.User;

import java.util.List;

public interface UserDAO {
    List<User> loadAllUsers();
    User loadUserById(Integer userId);
    User loadUserByUserName(String userName);
    Integer storeUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);

}
