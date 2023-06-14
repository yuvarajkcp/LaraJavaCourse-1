class Student
{
	int roll_number;
	String name;
	String college_name;
	String course;

	Student(int roll_number, String name)
	{
		this.roll_number = roll_number;
		this.name = name;
	}

	s{
		this.college_name = "Lara"; 
	}
	{
		this.course = "Java Full-stack"; 
	}

	public static void main(String[] args)
	{
		Student s1 = new Student(101,"Ashish");
		Student s2 = new Student(102,"Chatu");
		Student s3 = new Student(103,"Naveen");
		Student s4 = new Student(104,"Aditya");
		System.out.println(s1.roll_number + ", " + s1.name + ", " + s1.college_name + ", " + s1.course);
		System.out.println(s2.roll_number + ", " + s2.name + ", " + s2.college_name + ", " + s2.course);
		System.out.println(s3.roll_number + ", " + s3.name + ", " + s3.college_name + ", " + s3.course);
		System.out.println(s4.roll_number + ", " + s4.name + ", " + s4.college_name + ", " + s4.course);
	}
}