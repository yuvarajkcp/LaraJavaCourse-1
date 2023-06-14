class Y 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(99));
		System.out.println(99 >> 1);   //  right shift by 1   
		System.out.println(99 >> 2);   //  right shift by 2
		System.out.println(99 << 1);   // left shift by 1
		System.out.println(99 << 2);   //  left shift by 2
	}
}


/*
binary string format for 99 :  1100011
left shift by 1				: 11000110  ===>  198
left shift by 2				:110001100  ===>  396


binary string format for 99 :  1100011
right shift by 1			:  0110001  ===>  49
right shift by 2			:  0011000  ===>  24
