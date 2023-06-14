import java.util.Scanner;
class G
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one long value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		long value = sc.nextLong();
		System.out.println("long value is : " + value);
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes G
Please enter one long value:
922337203854789
long value is : 922337203854789

*/