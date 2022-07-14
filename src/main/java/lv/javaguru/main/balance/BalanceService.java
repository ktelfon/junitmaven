package lv.javaguru.main.balance;

import java.util.HashMap;
import java.util.Map;

public class BalanceService {

    private Map<String, Double> balance;

    public BalanceService() {
        this.balance = new HashMap<>();
    }

    public Double getBalance(String userName) {
        return balance.getOrDefault(userName, 0.0);
    }

    public void add(String userName, double amount) {
        if (balance.containsKey(userName)) {
            balance.put(userName, getBalance(userName) + amount);
        } else {
            balance.put(userName, amount);
        }
    }
}
