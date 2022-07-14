package lv.javaguru.main.balance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceServiceTest {

    BalanceService balanceService;

    @BeforeEach
    void beforeEach(){
        balanceService = new BalanceService();
    }

    @Test
    void getBalance() {
        double money = balanceService.getBalance("Ddeniss");
        assertEquals(0.0, money);
    }

    @Test
    void addMoneyToBalance(){
        String userName = "Deniss";
        double expectedAmount = 100.0;
        balanceService.add(userName, expectedAmount);
        double moneyFromBalance = balanceService.getBalance(userName);
        assertEquals(expectedAmount, moneyFromBalance);
    }

    @Test
    void addMoneyToBalanceToSameName(){
        String userName = "Deniss";
        double amountToAdd = 100.0;
        double expectedAmount = 200.0;
        balanceService.add(userName, amountToAdd);
        balanceService.add(userName, amountToAdd);
        double moneyFromBalance = balanceService.getBalance(userName);
        assertEquals(expectedAmount, moneyFromBalance);
    }
}