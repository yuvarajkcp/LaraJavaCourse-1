class N  extends Object 
{	     		         
	N()
	{
		//super(); //parent class
		System.out.println("N()");
	}
	N(int i)
	{
		this(); //current class.  this() means calling current class constructor
		System.out.println("N(int)");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("----------");
		N n2 = new N(10);
		System.out.println("----------");
	}
}
/*
in every constructors body the first statement would be super() calling statement.(if the programmer didn't keep super or 'this' calling statement explicitely)

each and every class is a sub class to object(whether directly or indirectly)

object class is the super most class in java

some of the commonly required memebers are inherited to the sub-classes from the object class.

super calling statement is calling the object class no argument constructor

in the object class we have one constructor which is no argument constructor, and we don't have any statements inside that constructor

super statement will be always calling the super class constructor

super and this statements comes under non-static.

this calling statement always the current class constructor not the super class constructor

if we only kept super(), or super with any argument then compiler will not be keeping super()

in the constructor body only either this or super calliing statement not both

N()
----------
N()
N(int)
----------
*/
	