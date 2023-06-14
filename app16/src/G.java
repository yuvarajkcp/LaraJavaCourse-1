class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
					System.out.println("loop begin:" + i++);
					System.out.println("loop end:" + i);
					i++;
		System.out.println("main end:" + i);
	}
}

//main begin
//loop begin:1
//loop begin:2
//loop begin:3
//loop begin:4
//loop begin:5
//loop end:6
//main end:7