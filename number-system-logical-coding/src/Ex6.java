//given number is 344523...read 445 from given number
class Ex6 
{
	public static void main(String[] args) 
	{
		int i = 344523;
		int j = (i / 100) % 1000;    //(i%100000) / 100;
		System.out.println(j);
	}
}
