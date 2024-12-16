package AmountAdd;

public class AmoutAdd {
    public String currency;
    public int amount;

    public AmoutAdd(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int add(AmoutAdd amountToAdd) throws CustomCurrencyException {
        if (!this.currency.equals(amountToAdd.currency)) {
            throw new CustomCurrencyException("Currency mismatch");
        }
        return this.amount + amountToAdd.amount;
    }
}
