import java.util.Scanner;
class J
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter Student Information: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Student roll-number: ");
		int roll_number = sc.nextInt();
		System.out.println("Please enter Student last name: ");
		String last_name = sc.nextLine();
		System.out.println("Please enter Student initial: ");
		char initial = sc.next().charAt(0);
		System.out.println("Please enter Student age: ");
		int age = sc.nextInt();
		System.out.println("Please enter Student enrolled course: ");
		String course = sc.next();
		System.out.println("Please enter Student skill: ");
		String skill = sc.next();
		System.out.println("Please enter Student total fee: ");
		double fees = sc.nextDouble();
		System.out.println("Please enter Student job offer status");
		boolean job_offer = sc.nextBoolean();

		System.out.println("--------------------------------------");
		System.out.println("\nStudent details : " + "\nroll_number: " + roll_number + "\nlast_name: " + last_name + "\ninitial: " + initial + "\nage: " + age + "\ncourse: " + course + "\nskill: " + skill+ "\nfees: " + fees + "\njob_offer: " + job_offer);
	}
}
//byte < short < int < long < float < double
