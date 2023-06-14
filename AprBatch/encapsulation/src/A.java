class A
{
	//data members
	private String name;
	private int rollNumber;
	private int age;

	//read-only//getter methods
	//getter and setter mehthod must be declared as public
	public String getName()
	{
		return name;//this.name;
	}

	public int getRollNumber()
	{
		return rollNumber;//this.rollNumber;
	}

	public int getAge()
	{
		return age;//this.age;
	}

	//write-only//setter methods

	public void setName(String name)
	{
		this.name = name;
	}

	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
class DriverClass
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
		System.out.println("------------------------------");
		a1.setName("Ashish");
		a1.setRollNumber(007);
		a1.setAge(28);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
	}
}
//static variables or non-static variables = data members (data)
//static methods or non-static methods = memeber functions (code)
/*
1. Encapsulation in Java is a process of wrapping code and data together 
into a single unit, for example, a capsule which is mixed of several medicines.
-we can able to achieve data security through encapsulation.
-we can achieve data hiding.
-by using getters and setters we can make the data ready-only or write-only
-by using getters and setters we can have control over the data.

2. We can create a fully encapsulated class in Java by making all the data 
   members of the class private.
3. By providing only a setter or getter method, you can make the class read-only
   or write-only. In other words, you can skip the getter or setter methods.
4. It provides you the control over the data. Suppose you want to set the value 
   of id which should be greater than 100 only, you can write the logic inside the setter method.
   You can write the logic not to store the negative numbers in the setter methods.
5. It is a way to achieve data hiding in Java because other class will not be able 
   to access the data through the private data members.
*/

