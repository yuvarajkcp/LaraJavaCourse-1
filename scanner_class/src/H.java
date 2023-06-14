import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter three int value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		System.out.println("addition of three Integer value is : " + (value1+value2+value3));
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes H
Please enter three int value:
10
20
5
addition of three Integer value is : 35

*/
