package Oops;

public class ClassB extends ClassA
{

	public void methodone()
	{
		System.out.println("hi am classB");
	}

	public static void main(String[] args) {
		
		
		ClassB b=new ClassB();
		b.methodone();
		b.methodtwo();
		
		ClassA a=new ClassA();
		
		a.methodone();
		a.methodtwo();
	}
}
