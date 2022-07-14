package lv.javaguru.main.exception;

public class WrongPassword extends Throwable {
    public WrongPassword(String s) {
        super(s);
    }
}
