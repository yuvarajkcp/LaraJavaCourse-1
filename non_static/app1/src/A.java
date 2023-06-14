class A 
{
	int i;  //here i is non static called attribute, field or property
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*non-static variable i cannot be referenced from a static context
                System.out.println(i);
*/
