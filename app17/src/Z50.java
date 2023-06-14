class Z50
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int i = 1;
		int j = test1(++i)/*3*/ + i /*2*/+ test2(i++) /*2*/+ i /*3*/+ test3(i++) /*3*/+ i + test4(++i) /*4*/+ i /*5*/+ test1(i++)/*6*/ + i /*6*/+ test2(++i) /*7*/+ i /*7*/+ test3(++i) /*8*/+ i /*8*/+ test4(i++)/*7*/ + i /*9*/;
		System.out.println("main end:" + i + ',' + j); 
	}
	public static  int test1(int i)
	{
		return ++i;
	}
	public static  int test2(int i)
	{
		return i++;
	}
	public static  int test3(int i)
	{
		return i--;
	}
	public static  int test4(int i)
	{
		return --i;
	}
				
}

/*

main begin
main end:9, 84

*/