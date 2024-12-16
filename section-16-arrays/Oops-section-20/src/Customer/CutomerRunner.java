package Customer;

public class CutomerRunner {
    public static void main(String[] args) {
        Customer cs1 = new Customer("John", new Address("Bangalore", "Karnataka", "560037"), 25);
        cs1.setWorkAddress(new Address("Mumbai", "Maharashtra", "400001"));
        System.out.println(cs1);
    }
}
