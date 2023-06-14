class G
{
	static void test1()
	{
		System.out.println("G-test1");
	}
}
class H extends G 
{
	static void test2()
	{
		System.out.println("H-test2");
	}
	public static void main(String[] args) 
	{
		H.test1();
		H.test2();
	}
}
//static methods also will be inheriting to the subclass
/*The code you provided consists of two classes, `G` and `H`, where `H` is a subclass of `G`. Let's break it down step by step:

1. The class `G` contains a static method named `test1`.

2. The method `test1` prints the string "G-test1" to the console using `System.out.println()`.

3. The class `H` extends class `G`, which means that class `H` inherits the members (including static methods) of class `G`.

4. The class `H` also declares its own static method named `test2`.

5. The method `test2` in class `H` prints the string "H-test2" to the console using `System.out.println()`.

6. Inside the `main` method of class `H`, there are two lines of code that invoke the static methods `test1()` and `test2()` using `H.test1()` and `H.test2()` respectively.

7. When you run this Java program, it will output the following to the console:

```
G-test1
H-test2
```

In summary, this code demonstrates the inheritance of static methods from a superclass to a subclass. Class `H` inherits the static method `test1` from class `G` and also declares its own static method `test2`. The `main` method of class `H` invokes both `test1()` and `test2()`, resulting in the respective messages being printed to the console.*/