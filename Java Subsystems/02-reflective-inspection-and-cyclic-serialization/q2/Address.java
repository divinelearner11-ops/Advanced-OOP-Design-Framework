public class Address {
    private String city;
    private int pincode;

    public Address() {}

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() { return city; }
    public int getPincode() { return pincode; }

    @Override
    public String toString() {
        return "Address{city=" + city + ", pincode=" + pincode + "}";
    }
}
