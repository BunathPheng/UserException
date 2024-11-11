import exception.UserNotFoundException;
import model.User;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImp;

public class Main{
    public static void main(String[] args) {
        UserServiceImp userService = new UserServiceImp();
        System.out.println("This is all user in list");
        for(User user : userService.getAllUser())
        {
            System.out.println(user);
        }
        System.out.println("Find user by ID");
        try {
            System.out.println(userService.findUserById(3));
        }catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
