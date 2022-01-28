package preproject._1_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import preproject._1_1.dao.UserDao;
import preproject._1_1.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    @Override
    @Transactional
    public void update (int id,User userUpdated) {
        userDao.update(id, userUpdated);
    }

}
