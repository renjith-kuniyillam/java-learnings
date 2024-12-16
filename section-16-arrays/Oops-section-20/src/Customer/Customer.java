package Customer;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;
    private int age;

    public Address getWorkAddress() {
        return workAddress;
    }

    public Customer(String name, Address homeAddress, int age) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.age = age;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("Customer [name=%s, homeAddress=%s, workAddress=%s, age=%d]", name, homeAddress, workAddress, age);
    }

}
