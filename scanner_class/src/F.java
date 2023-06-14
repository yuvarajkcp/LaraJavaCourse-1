import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one short value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		short value = sc.nextShort();
		System.out.println("short value is : " + value);
	}
}
/*
D:\april-batch-lab\scanner_class\src>java -cp ../classes F
Please enter one short value:
596
short value is : 596

D:\april-batch-lab\scanner_class\src>java -cp ../classes F
Please enter one short value:
32767
short value is : 32767
*/