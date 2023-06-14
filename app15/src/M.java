//labelled loops
class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		loop1:  //identifier:
		for (int i = 1;i <= 2 ; i++)
		 {
			System.out.println("outer loop begin:" + i);
			for (int j = 101;j <= 105 ; j++)
			{
				System.out.println("inner loop begin:" + i + " , " + j);
				if(j == 103)
				{
				break loop1;
				}
				System.out.println("inner loop end:" + i + " , " + j);
			}
			System.out.println("outer loop end:" + i);
		 }
		System.out.println("main end");
	}
}

//outer loop begin:1
//inner loop begin:1 , 101
//inner loop end:1 , 101
//inner loop begin:1 , 102
//inner loop end:1 , 102
//inner loop begin:1 , 103
//main end