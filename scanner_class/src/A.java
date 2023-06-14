import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter your name: ");
		Scanner sc = new Scanner(System.in);  //syntax
		String name = sc.next();
		System.out.println("welcome: " + name);
	}
}
/*
D:\april-batch-lab\scanner_class\src>javac -d ../classes A.java

D:\april-batch-lab\scanner_class\src>java -cp ../classes A
Please enter your name:
Praveen
welcome: Praveen

D:\april-batch-lab\scanner_class\src>java -cp ../classes A
Please enter your name:
Anitha Thapa
welcome: Anitha

*/
