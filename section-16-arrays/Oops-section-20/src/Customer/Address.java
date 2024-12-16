package Customer;

public class Address {
    private String city;
    private String state;
    private String zip;

    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return String.format("Address [city=%s, state=%s, zip=%s]", city, state, zip);
    }
}
