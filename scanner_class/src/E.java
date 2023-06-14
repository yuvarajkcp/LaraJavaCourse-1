import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one byte value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		byte value = sc.nextByte();
		System.out.println("byte value is : " + value);
	}
}
/*

D:\april-batch-lab\scanner_class\src>javac -d ../classes E.java

D:\april-batch-lab\scanner_class\src>java -cp ../classes E
Please enter one int value:
127
byte value is : 127

*/