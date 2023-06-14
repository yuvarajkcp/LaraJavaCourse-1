class Person {
    private String name;
    private int age;
    private String address;

    // Getters and setters for name, age, and address
    // ...

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.setAddress("123 Main St");
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}