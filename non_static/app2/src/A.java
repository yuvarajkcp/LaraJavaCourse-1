//constructor
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


//constructor is a special type of method but its not a regular method, internally compiler will be considerating it a method.

//the main difference between a method and constructor must not have a return type
//constructors are mainly used for initializing the objects

//in each and every class, if there is no constructors are defined by the programmer then, compiler only keeps a default constructor which is no argument constructor.(it doesn't take any argument)

//rules for constructor
/*  1. constructor name must be same as class name.(case-sensitive)
	2.constructors must not have a return value.
	3.constructors must be having a body {}
	4.constructor can have access specifiers or access modifiers

some general points

1.constructor can have access  specifiers(modifiers)
2.constructor can take any number of arguments.
3.constructor are executed while we are creating the object to a particular class.
4.while creating the object we need to call the corresponding available constructor only.

*/


/*
from A()
done
*/