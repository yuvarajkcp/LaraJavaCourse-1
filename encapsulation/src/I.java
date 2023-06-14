class Person {
    private String name;
    private int age;
    private String address;

   public String getName()
	{
		return name;
	}
   public int getAge()
	{
		return age;
	}
   public String getAddress()
	{
		return address;
	}
   public void setName(String name)
	{
		this.name = name;
	}
   public void setAge(int age)
	{
		this.age = age;
	}
   public void setAddress(String address)
	{
		this.address = address;
	}

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
/*
D:\april-batch-lab\encapsulation\src>javac -d ../classes I.java

D:\april-batch-lab\encapsulation\src>java -cp ../classes Person
Name: John
Age: 30
Address: 123 Main St

*/