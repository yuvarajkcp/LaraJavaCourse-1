class Customer {
    private String name;
    private String address;
    private String accountNumber;

    // Getters and setters for name, address, and accountNumber
    // ...

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setAddress("123 Main St");
        customer.setAccountNumber("123456789");
        String name = customer.getName();
        String address = customer.getAddress();
        String accountNumber = customer.getAccountNumber();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accountNumber);
    }
}