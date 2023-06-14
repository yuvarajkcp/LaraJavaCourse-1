// Class A
class A {
    // Static initialization block
    static {
        System.out.println("A-SIB");
    }

    // Constructor
    A() {
        System.out.println("A()");
    }

    // Instance initialization block
    {
        System.out.println("A-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class A");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class A");
    }
}

// Class B
class B extends A {
    // Static initialization block
    static {
        System.out.println("B-SIB");
    }

    // Constructor
    B() {
        System.out.println("B()");
    }

    // Instance initialization block
    {
        System.out.println("B-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class B");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class B");
    }
}

// Class C
class C extends B {
    // Static initialization block
    static {
        System.out.println("C-SIB");
    }

    // Constructor
    C() {
        System.out.println("C()");
    }

    // Instance initialization block
    {
        System.out.println("C-IIB");
    }

    // Non-static method
    public void non_static_method() {
        System.out.println("This is a non-static method in class C");
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method in class C");
    }
}

// Main class
class Main {
    // Static initialization block
    static {
        System.out.println("Main-SIB");
    }

    public static void main(String[] args) {
        System.out.println("main begin");

        // For loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration " + i);
        }

        // While loop
        int j = 0;
        while (j < 3) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        // Do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
        } while (k < 3);

        // Ternary operator
        int x = 5;
        int y = 10;
        String result = (x > y) ? "x is greater than y" : "y is greater than x";
        System.out.println(result);

        // Constructor
        C c1 = new C();

        // Static block
        System.out.println("-----------");
        B b1 = new B();
        System.out.println("-----------");
        A a1 = new A();

        // Static method
        C.static_method();
        B.static_method();
        A.static_method();

        // Non-static method
        c1.non_static_method();
        b1.non_static_method();
        a1.non_static_method();

        System.out.println("main end");
    }
}

/*

























class A {
    static {
        System.out.println("A-SIB");
    }

    A() {
        // super();
        // IIB
        System.out.println("A()");
    }

    {
        System.out.println("A-IIB");
    }

    public void non_static_method() {
        System.out.println("This is a non-static method in class A");
    }

    public static void static_method() {
        System.out.println("This is a static method in class A");
    }
}

class B extends A {
    static {
        System.out.println("B-SIB");
    }

    B() {
        // super();
        // IIB
        System.out.println("B()");
    }

    {
        System.out.println("B-IIB");
    }

    public void non_static_method() {
        System.out.println("This is a non-static method in class B");
    }

    public static void static_method() {
        System.out.println("This is a static method in class B");
    }
}

class C extends B {
    static {
        System.out.println("C-SIB");
    }

    C() {
        // super();
        // IIB
        System.out.println("C()");
    }

    {
        System.out.println("C-IIB");
    }

    public void non_static_method() {
        System.out.println("This is a non-static method in class C");
    }

    public static void static_method() {
        System.out.println("This is a static method in class C");
    }
}

class ZZZ {
    static {
        System.out.println("Z6-SIB");
    }

    public static void main(String[] args) {
        System.out.println("main begin");

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration " + i);
        }

        // while loop
        int j = 0;
        while (j < 3) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
        } while (k < 3);

        // ternary operator
        int x = 5;
        int y = 10;
        String result = (x > y) ? "x is greater than y" : "y is greater than x";
        System.out.println(result);

        // constructor
        C c1 = new C();

        // static block
        System.out.println("-----------");
        B b1 = new B();
        System.out.println("-----------");
        A a1 = new A();

        // static method
        C.static_method();
        B.static_method();
        A.static_method();

        // non-static method
        c1.non_static_method();
        b1.non_static_method();
        a1.non_static_method();

        System.out.println("main end");
    }
}
*/