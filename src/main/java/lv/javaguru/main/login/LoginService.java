package lv.javaguru.main.login;



import lv.javaguru.main.exception.UserNotFound;
import lv.javaguru.main.exception.WrongPassword;

import java.util.List;

public class LoginService {

    private String currentlyLoggedIn;

    private List<User> userNames = List.of(
            new User("Deniss", "123qwe123"),
            new User("Evan", "qweqwe12"),
            new User("Glorija", "1q2w3e4r")
    );

    public boolean logIn(String userName, String password) throws UserNotFound, WrongPassword {
        User tmpUser = new User(userName, password);
        for (User name : userNames) {
            if (!name.equals(tmpUser)) {
                continue;
            }
            if (!name.getPassword().equals(tmpUser.getPassword())) {
                throw new WrongPassword("Wrong password!");
            } else {
                currentlyLoggedIn = userName;
                return true;
            }
        }
        throw new UserNotFound("No user with name: " + userName + " found", userName);
    }

    public String getCurrentlyLoggedIn() {
        return currentlyLoggedIn;
    }
}
