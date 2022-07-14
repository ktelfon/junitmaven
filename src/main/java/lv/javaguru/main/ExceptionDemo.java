package lv.javaguru.main;

import lv.javaguru.main.exception.UserNotFound;
import lv.javaguru.main.exception.WrongPassword;
import lv.javaguru.main.login.LoginService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionDemo {
    public static void main(String[] args) {
        List<String> badUserNames = new ArrayList<>();
        LoginService loginService = new LoginService();
        try {
            loginService.logIn("Hkajsdf", "asdfsdf");
        } catch (UserNotFound e) {
            badUserNames.add(e.getWrongUserName());
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        } catch (WrongPassword e) {

            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println(badUserNames);
    }

    public static String readFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes);
    }
}
