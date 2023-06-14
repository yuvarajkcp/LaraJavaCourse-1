//single inheritance
//Java supports single inheritance, meaning a class can inherits from only one superclass.
//parent//base//super-class

//child//derived//sub-class
//extends is a keyword
//one class can able to extend onother class at a time.
//at a time a class can able to extend only one class
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
class A
{
	int i;
}
//Inheritance is a process of aquiring the properties and behaviours from another class.
//By using inheritance we can achieve code reuseability.
//Inheritance is a fundamental concept in object-oriented programming (OOP) that allows classes to inherit properties and behaviors from other classes.


/*
The code you provided demonstrates Java inheritance. Class `B` extends class `A`, which means that `B` inherits the members of `A`, including the `i` variable. In the `main` method of class `B`, an object of type `B` is created and assigned to the variable `b1`. 

Since class `B` inherits class `A`, the object `b1` has access to the `i` variable from class `A`. Therefore, the code `b1.i` will print the value of `i`.

However, class `B` also introduces its own member called `j`, which is specific to class `B`. In this case, `b1` can access both `i` and `j`. So, the code `b1.j` will print the value of `j`.

Here's the modified version of your code with the appropriate output:

```java
class A {
    int i;
}

class B extends A {
    int j;

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.i); // Output: 0
        System.out.println(b1.j); // Output: 0
    }
}
```

Since the `i` and `j` variables are not explicitly initialized, their default values (0 for integers) will be printed.
/*
