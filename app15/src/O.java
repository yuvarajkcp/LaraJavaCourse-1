class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		loop1:  //identifier:
		for (int i = 1;i <= 2 ; i++)
		 {
			System.out.println("outer loop begin:" + i);
			loop2:
			for (int j = 100;j <= 104 ; j++)
			{
				System.out.println("inner loop begin:" + i + " , " + j);
				if(j == 103)
				{
				   continue loop1;
				}
				System.out.println("inner loop end:" + i + " , " + j);
			}
			System.out.println("outer loop end:" + i);
		 }
		System.out.println("main end");
	}
}


//main begin
//outer loop begin:1
//inner loop begin:1 , 100
//inner loop end:1 , 100
//inner loop begin:1 , 101
//inner loop end:1 , 101
//inner loop begin:1 , 102
//inner loop end:1 , 102
//inner loop begin:1 , 103
//outer loop begin:2
//inner loop begin:2 , 100
//inner loop end:2 , 100
//inner loop begin:2 , 101
//inner loop end:2 , 101
//inner loop begin:2 , 102
//inner loop end:2 , 102
//inner loop begin:2 , 103
//main end