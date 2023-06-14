class Z51 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++, true)  +  i   +  test1(++i, true)   +  i    +  test1(i++, false)  +  i  +
// results		  1                  2         3                  3           4                 4
// i value        2                  2         3                  3           4                 4
				test2(i++, false)  +  i   +  test2(++i, false)   +  i    +  test2(i++, true)  +  i;
// results		  4                   5         6                  6           7                 7
// i value        5                   5         6                  6           7                 7
		System.out.println(i); // 7
		System.out.println(j); //
	}
	static int test1(int i, boolean flag)
	{
		return flag ? i++ : ++i;
	}
	static int test2(int i, boolean flag)
	{
		return flag ? ++i : i++;
	}
}
