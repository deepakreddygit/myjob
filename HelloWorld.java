public class HelloWorld
{
	public static void main(String args[])
	{
		System.out.println("Welcome to java");
		A obj = new A();
		obj.add(6,8);
	}
}
class A
{
	int x;
	int y;
	int z;
	void add(int a,int b)
	{
		x=a;
		y=b;
		z=a+b;
		System.out.println("Addition : "+z);
	}
		
}	
