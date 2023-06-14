class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Implement name validation logic here
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Implement age validation logic here
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        String name = student.getName();
        int age = student.getAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}