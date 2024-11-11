package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepository {
    public static List<User> getAllUser()
    {
        List<User> users = new ArrayList<User>(
                List.of(new User(1, "anna" , "123!33" , "nana@gmail.com" , "M") ,
                        new User(2, "Lolo" , "wewe12!@", "lolo@gmail.com", "F"))
        );
        return users;
    }
}
