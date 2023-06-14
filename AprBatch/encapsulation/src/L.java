class MobilePhone {
    private String brand;
    private String model;
    private String color;

    // Getters and setters for brand, model, and color
    // ...

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21");
        phone.setColor("Black");
        String brand = phone.getBrand();
        String model = phone.getModel();
        String color = phone.getColor();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}