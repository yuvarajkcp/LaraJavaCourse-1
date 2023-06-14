public class B
{
    private String name;
    private int age;
    
    public String getName()
	{
        return name;
    }
    
    public void setName(String name)
	{
        this.name = name;
    }
    
    public int getAge()
	{
        return age;
    }
    
    public void setAge(int age)
	{
        this.age = age;
    }
}
public class Main
{
    public static void main(String[] args)
	{
        B b1 = new B();
        b1.setName("John");
        b1.setAge(30);
        
        System.out.println("Name: " + b1.getName());
        System.out.println("Age: " + b1.getAge());
    }
}


/*
 Encapsulation is one of the fundamental principles of object-oriented programming (OOP) and involves hiding internal data and implementation details of a class and providing access to them through methods. It helps in achieving data abstraction and protects the data from unauthorized access.
*/
