class Employee {
    private String name;
    private double salary;

    // Getters and setters for name and salary
    // ...

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(50000.0);
        String name = employee.getName();
        double salary = employee.getSalary();
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}