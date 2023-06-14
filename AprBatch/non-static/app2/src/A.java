class A
{
	A()
	{
		System.out.println("from A()");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("done");
	}
}
//What is a constructor?
//Constructor is a special type of method, but its not a regular method, internaly compiler will be considering it a method. 
//The main difference between a method and constructor is that method must have return type, but constructor must not have a return type.
//constrotors are maily used for intializing objects
//if there are no constructors are defined by the programmer then, compilar only keeps a default construtor,In every class, which is no argument constructor(its doesnt takes any argument).
//Rules for constructor
//1. constructor name must be same as class name(case-sensitive).
//2. constructors must not have a return type.
//2. constructors must be having a body{}

//some general points
//1.constructor can have access specifiers(modifiers)
//2.constructor can take any no. of arguments.
//3.constructors are executed while we are creating the object to that particular class.
//4.while creating the object we need to call the a corresponding, availble constructor only. 