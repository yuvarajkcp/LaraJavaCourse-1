class G {
	int i;

	public static void main(String[] args) {
		G g1 = new G();// Object creation
		System.out.println(g1.i);// by using the reference of G class object we can access the non static
									// variable i.
		// this g1 reference is local to main method.
	}
}
// An object is a real world entity
// class is a blue print to create the objects
// Objects will be having attributes and behaviours
// Ex: Dog Object Properties or attributes: name, age, color, breed, gender,
// weight
// Behaviours: bark(), chaseCat(), bite(), chaseVehicle()
// properties = data members
// behaviours = member functions
// for one class you can able to create any no. of objects.
// G g1 = G(class name), g1(reference variable name)(name can be anything)
// = assignment operator(left side assignment)
// new is a keyword and also an operator
// G(); - calling G class no argument constructor.
// variable, method follow the case like variableNumberOne, methodNumberOne
// variable name should be a valid identifier
// while you are refering to the class case must be same(as a standard we will
// write the class name in camel case like ThisIsTheCamelCase)
// Objects are stored inside heap memory
// non-static members are loading to the memory while objects are created.
// all the non-static members are loading to the memory while we are creating
// objects to that particular class.it can be non-variable or can be non-static
// mehtod or it can be a non static block.