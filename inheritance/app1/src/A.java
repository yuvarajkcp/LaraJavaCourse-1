//single inheritance
//parent class or base class or super class
class A 
{
	int i;
}
//child class or derived class or sub class
//one class can able to extend another class at a time
//at a time one class can able to extend only one class
class B extends A //extends is a keyword
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}

/*
The code we provided demonstrates java inheritance. Class 'B' extends class 'A', which means that 'B' inherits the members of 'A', including the 'i' variable. In the 'main' method of class'B', an object of type 'B' is created ans assigned to the variable
one class can able to extend another class at a time

java can support single inheritance, meaning a class can inherit from only one superclass

D:\april-batch-lab\inheritance\src>javac -d ../classes A.java

D:\april-batch-lab\inheritance\src>java -cp ../classes B
0
0

*/
