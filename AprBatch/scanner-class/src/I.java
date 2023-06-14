import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter Student Information: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Student roll-number: ");
		int roll_number = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter Student first-last name: ");
		String first_last_name = sc.nextLine();
		System.out.println("Please enter Student initials: ");
		char initials = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Please enter Student age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter Student enrolled course: ");
		String course = sc.next();
		sc.nextLine();
		System.out.println("Please enter Student skills: ");
		String skills = sc.nextLine();
		System.out.println("Please enter Student total fee: ");
		double fees = sc.nextDouble();
		System.out.println("Please enter Student job offer status");
		int job_offer = sc.nextInt();

		System.out.println("--------------------------------------");
		System.out.println("\nStudent details : " + "\nroll_number: " + roll_number + "\nfirst_last_name: " + first_last_name + "\ninitials: " + initials + "\nage: " + age + "\ncourse: " + course + "\nskills: " + skills + "\nfees: " + fees + "\njob_offer: " + job_offer);
	}
}
//byte < short < int < long < float < double
