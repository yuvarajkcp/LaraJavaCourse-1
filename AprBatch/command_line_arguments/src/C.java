class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);
	}
}
//JVM will be calling the main method by supplying empty string array object if you dont supply anything as a command line argument while executing any class.
//if you directly print the array reference you will be getting the memory address of that array object.
//each and every array will be having a length. we can find out the array length by using 'lenght' property(by calling length property on the array reference). 
//arrays are also objects in java.
//array index will be starting from 0 but length we will caluculate from no. 1.
//if there are no elemets are present in the array then we can say that array is empty or (size or lenght is 0).
//by default whatever the value you are supplying as command line argument that will be considered as string type only.

