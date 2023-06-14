public class Y {
    {
        // System.out.println(i); can't use a field before it is defined
        i = 20; // but, can be initialized
    }
    // Illegal forward reference error applies to non-static variables also.
    int i;
}