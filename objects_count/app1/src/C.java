class C 
{
	static int count;
	C()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		C obj1 = new C();
		System.out.println("a: "+ obj1.count);
		C obj2 = new C();
		System.out.println("b: "+ obj2.count);
		C obj3 = new C();
		System.out.println("c: "+ obj3.count);
		C obj4 = new C();
		System.out.println("d: "+ count);
		
	}
}
/*
static load only once in a class
a: 1
b: 2
c: 3
d: 4

*/