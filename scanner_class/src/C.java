import java.util.Scanner;
class C
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one int value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		int value = sc.nextInt();
		System.out.println("Integer value is : " + value);
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes C
Please enter one int value:
1000
Integer value is : 1000

D:\april-batch-lab\scanner_class\src>java -cp ../classes C
Please enter one int value:
5000 256 2155 425
Integer value is : 5000

*/