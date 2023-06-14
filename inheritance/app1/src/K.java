//each and every class will be extending object class either directly or indirectly
//if class is not extending any other class then that class is direct subclass of object class
//if the class is already extending another class then that class is the indirect sub-class of object class.
//whether we keep it or not compiler only keeps the extends for all the classes .
class K //extends object
{
	K()
	{
		//if we don't keep any expicit super or this calling statement in the constructor body as a first statement, then compiler only keeps the super with no argument calling statement[super();].
		System.out.println("K()");	
	}
}

class L extends K
{
	L()
	{
		super();
		System.out.println("L()");	
	}
	public static void main(String[] args) 
	{
		L obj = new L();

	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes K.java

D:\april-batch-lab\inheritance\src>java -cp ../classes L
K()
L()
*/