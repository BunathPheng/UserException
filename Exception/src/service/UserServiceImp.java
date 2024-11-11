package service;

import exception.UserNotFoundException;
import model.User;
import repository.UserRepository;

import java.util.List;

public class UserServiceImp implements UserService{
    @Override
    public List<User> getAllUser() {
        return UserRepository.getAllUser();
    }

    @Override
    public User findUserById(Integer id) throws UserNotFoundException {
        var  user = UserRepository.getAllUser().stream().filter(e-> e.getId().equals(id)).toList();
        if(user.isEmpty())
        {
            throw new UserNotFoundException("User is not found this id:" + id);
        }
        return user.getFirst();
    }
}
