package preproject._1_1.dao;


import preproject._1_1.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> userList();
    User findById(int id);
    void deleteById(int id);
    void update (int id,User userUpdated);
}
