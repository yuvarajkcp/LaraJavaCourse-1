class  E
{
	int i;
	static 
	{
		System.out.println(i);
	}
}
/* non-static variable i cannot be referenced from a static context
                System.out.println(i);
*/