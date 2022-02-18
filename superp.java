class A
{
	int x=20;
	//System.out.println("the super class "+x);
}
class B extends A
{
	int x=10;
	public void show()
		{
    System.out.println("the sub class x is: "+this .x);
	System.out.println("the sub class x is "+x);
	System.out.println("the suoer class x is "+super.x);
	}
}
	class superp
{
	public static void main(String[] args)
	
	{
	B ob =new B();
	ob.show();
}
}

