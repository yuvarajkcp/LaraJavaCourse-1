import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter student information : ");
		Scanner sc= new Scanner(System.in); 
		System.out.println("Please enter student roll-number : ");
		int roll_number=sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter student first-last name : ");
		String first_last_name=sc.nextLine();
		System.out.println("Please enter student initials : ");
		char initials = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Please enter student age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter student enrolled course : ");
		String course = sc.nextLine();
		System.out.println("Please enter student skills : ");
		String skills = sc.nextLine();
		System.out.println("Please enter student total fee : ");
		double fees = sc.nextDouble();
		System.out.println("Please enter student job offer status : ");
		boolean job_offer = sc.nextBoolean();

		System.out.println("------------------------------------------------- ");
		System.out.println("\nstudent details : " + "\nroll_number: " + roll_number + "\nfirst_last_name: " +  first_last_name + "\ninitials: " + initials + "\nage: " + age + "\ncourse:" + course + "\nskills: " + skills + "\nfees: " + fees + "\njob_offer: " + job_offer );
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes I
Please enter student information :
Please enter student roll-number :
101
Please enter student first-last name :
anitha
Please enter student initials :
J
Please enter student age :
25
Please enter student enrolled course :
java
Please enter student skills :
java
Please enter student total fee :
50000
Please enter student job offer status :
false
-------------------------------------------------

student details :
roll_number: 101
first_last_name: anitha
initials: J
age: 25
course:java
skills:
fees: 50000.0
job_offer: false
*/