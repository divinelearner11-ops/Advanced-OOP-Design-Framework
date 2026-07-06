public class Main {
    public static void main(String[] args) {
        Address original = new Address("Sagar", 470004);
        System.out.println("Original: " + original);

        try {
            Address copy = (Address) DeepCopyUtil.deepCopy(original);
            System.out.println("Copy:     " + copy);

            // Verify they are different objects
            System.out.println("Same reference: " + (original == copy));
            System.out.println("City matches: " + original.getCity().equals(copy.getCity()));
            System.out.println("Pincode matches: " + (original.getPincode() == copy.getPincode()));
        } catch (Exception e) {
            System.out.println("Error during deep copy: " + e.getMessage());
        }
    }
}
