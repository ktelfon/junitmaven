package lv.javaguru.main.login;

import lv.javaguru.main.exception.UserNotFound;
import lv.javaguru.main.exception.WrongPassword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void logInCorrectUserNameAndPassword() throws UserNotFound, WrongPassword {
        LoginService loginService = new LoginService();
        String expectedUserName = "Deniss";
        String password = "123qwe123";
        boolean result = loginService.logIn(expectedUserName, password);
        String userLoggedIn = loginService.getCurrentlyLoggedIn();
        assertTrue(result);
        assertEquals(expectedUserName, userLoggedIn);
    }

}