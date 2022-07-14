package lv.javaguru.main;

import lv.javaguru.main.balance.BalanceService;
import lv.javaguru.main.exception.UserNotFound;
import lv.javaguru.main.exception.WrongPassword;
import lv.javaguru.main.login.LoginService;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private LoginService loginService;
    private BalanceService balanceService;

    public Bank() {
        this.loginService = new LoginService();
        this.balanceService = new BalanceService();
    }

    public void login(String userName, String password) throws UserNotFound, WrongPassword {
        loginService.logIn(userName, password);
    }

    public void showBalance() {
        double money = balanceService.getBalance(loginService.getCurrentlyLoggedIn());
        System.out.println(money);
    }

}
