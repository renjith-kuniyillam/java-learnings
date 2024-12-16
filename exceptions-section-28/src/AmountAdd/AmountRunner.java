package AmountAdd;

public class AmountRunner {
    public static void main(String[] args) throws Exception {
        AmoutAdd amount1 = new AmoutAdd("USD", 100);
        AmoutAdd amount2 = new AmoutAdd("EUR", 200);

        System.out.println("Total amount is: " + amount1.add(amount2));
    }
}
