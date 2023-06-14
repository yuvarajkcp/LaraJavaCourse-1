class A
{
	//data members
	private String name;
	private int rollNumber;
	private int age;

	//read-only//getter methods
	public String getName()
	{
		return name; //this.name;
	}

	public int getRollNumber()
	{
		return rollNumber;//this.rollNumber;
	}

	public int getAge()
	{
		return age;//this.age
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
		System.out.println(a1.getAge()); //System.out.println(a1.getAge=25) not possible
		System.out.println("----------------------------------");
		a1.setName("Anitha");
		a1.setRollNumber(007);
		a1.setAge(25);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
	}
}
//if data members are private we cannot access outside the class(access within the same class)

/*
D:\april-batch-lab\encapsulation\src>javac -d ../classes A.java

D:\april-batch-lab\encapsulation\src>java -cp ../classes DriverClass
null
0
0
----------------------------------
Anitha
7
25
*/