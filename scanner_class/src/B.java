import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter your complete name: ");
		Scanner sc = new Scanner(System.in);  //syntax
		String name = sc.nextLine();
		System.out.println("welcome: " + name);
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes B
Please enter your complete name:
Anitha Thapa Praveen
welcome: Anitha Thapa Praveen
*/