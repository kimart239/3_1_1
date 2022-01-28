package preproject._1_1.service;

import preproject._1_1.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> userList();
    User findById(int id);
    void deleteById(int id);
    void update (int id,User userUpdated);
}
