package java1;

public class Sample 
{
	//properties
	private int x; // for current class only
	protected int y; // for child classes
	int z;	// for current package level
	public int w;	// for project level
	
	// general method
	public void method()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
}
