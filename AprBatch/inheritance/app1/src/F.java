class E
{
	static int i;
}
class F extends E 
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
//static variables are also inheriting to the subclass from the superclass.
//by using subclass reference only we can access static members of subclass.no need of creating object.
//even by creating object to subclass also we access static variables.

/*In Java, static members are not involved in the process of inheritance because they belong to the class itself, rather than to individual objects. 

When a subclass extends a superclass, it inherits the instance members (fields and methods) of the superclass. These instance members are associated with individual objects and can have different values or behaviors for each object. Inheritance allows the subclass to reuse and extend these instance members.

On the other hand, static members are associated with the class itself and are shared among all instances of the class. They have a single copy that is shared across all objects of that class. Static members are stored in a special area of memory separate from the individual object instances.

The primary purpose of inheritance is to allow subclasses to inherit and extend the behavior of their superclass. Static members, being independent of object instances, are not subject to extension or polymorphism. They are tied to the specific class in which they are defined, and they do not change based on subclassing or object instantiation.

In order to access static members, you can use the class name directly without the need for inheritance. Static members are accessible through the class name because they are associated with the class itself rather than with individual objects or their inheritance hierarchy.

By excluding static members from the inheritance process, Java promotes encapsulation and maintains a clear separation between class-level behavior (static members) and instance-level behavior (instance members).*/
/*The code you provided consists of two classes, `E` and `F`, where `F` is a subclass of `E`. Let's break it down step by step:

1. The class `E` declares a static integer variable `i`.

2. The class `F` extends class `E`, which means that class `F` inherits the members (including static variables) of class `E`.

3. Class `F` also declares its own static integer variable `j`.

4. Inside the `main` method of class `F`, there are two lines of code that print the values of the static variables `i` and `j` using `System.out.println()`.

5. The `System.out` and `println` parts work the same way as in the previous examples.

6. Since `F` is a subclass of `E`, it inherits the static variable `i` from class `E`. Therefore, `F` can directly access `i` as `F.i`.

7. Similarly, `F` can directly access its own static variable `j` as `F.j`.

8. When you run this Java program, it will output the values of `F.i` and `F.j` to the console. However, since the values of `i` and `j` are not assigned explicitly, they will both have the default value for `int`, which is `0`.

In summary, this code demonstrates the inheritance of static variables from a superclass to a subclass. Class `F` inherits the static variable `i` from class `E` and also declares its own static variable `j`. The `main` method of class `F` accesses and prints the values of both `i` and `j`.*/