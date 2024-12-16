package AmountAdd;

public class CustomCurrencyException extends Exception{

    public CustomCurrencyException(String message) {
        super("This is a custom exception ::" + message);
    }
}
