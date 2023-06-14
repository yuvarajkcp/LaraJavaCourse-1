//for - each loop or enhanced for-loop
class  P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements = {10, 30, 20, 70, 35, 28};
		for (int element : elements) //for-each (JDK 1.5)
		{
			System.out.println(element);
		}
		System.out.println("main end");
	}
}



//main begin
//10
//30
//20
//70
//35
//28
//main end
