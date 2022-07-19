package Package;

import java.util.Scanner;

public class Factorial 
{
int fact(int n) {
	if(n==1)
		return 1;
	int x=n*fact(n-1);
	return x;
	
}
	public static void main(String[] args) 
		// finding Factorial value by using recursion
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		Factorial f=new Factorial();
		int result=f.fact(a);
		System.out.println(result);

	}

}
