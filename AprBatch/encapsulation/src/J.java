lass Product {
    private String name;
    private double price;
    private int quantity;

    // Getters and setters for name, price, and quantity
    // ...

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Phone");
        product.setPrice(500.0);
        product.setQuantity(10);
        String name = product.getName();
        double price = product.getPrice();
        int quantity = product.getQuantity();
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}