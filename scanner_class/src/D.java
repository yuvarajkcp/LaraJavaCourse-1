import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		//float f1 = 20.0F;
		System.out.println("Please enter one double value: ");
		Scanner sc = new Scanner(System.in);  //syntax
		double value = sc.nextDouble();
		System.out.println("Double value is : " + value);
	}
}
/*
D:\april-batch-lab\scanner_class\src>javac -d ../classes D.java

D:\april-batch-lab\scanner_class\src>java -cp ../classes D
Please enter one int value:
256
Double value is : 256.0

D:\april-batch-lab\scanner_class\src>java -cp ../classes D
Please enter one int value:
0.00005
Double value is : 5.0E-5

D:\april-batch-lab\scanner_class\src>java -cp ../classes D
Please enter one int value:
1.235
Double value is : 1.235

D:\april-batch-lab\scanner_class\src>java -cp ../classes D
Please enter one int value:
200.
Double value is : 200.0

byte < short < int < long < float < double
*/