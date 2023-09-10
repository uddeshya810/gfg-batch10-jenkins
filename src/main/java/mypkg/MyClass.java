package mypkg;
import java.util.Scanner;
public class MyClass {

	
	public int areaRect(int l , int b)
	{
		return (l*b);
	}
	public int areaSq(int s)
	{
		return (s*s);
	}
	public float areaCircle(float r)
	{
		return (float) (3.14*r*r);
	}
	public void show()
	{
		System.out.println("Hello GFG");
		System.out.println("Welome to Jenkins Pipeline, This is DevOps class");
	}
	public int areaCube(int s)
	{
		return (6*s);
	}
	public int sumNew(int a, int b)
	{
		int c;
		int d;
		int e;
		c=10+10;
		return c;
	}
	
	public int sum(int a, int b)
	{
		int f;
		int g;
		f=50+60;
		return f;
	}	
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :");
		l=sc.nextInt();
		System.out.println("Enter Breadth :");
		b=sc.nextInt();
		System.out.println("Area of the given Rectangle is : "+ob.areaRect(l, b) );
		System.out.println("Area of the given Square is : "+ob.areaSq(10) );
		System.out.println("Area of the given Square is : "+ob.areaCube(10) );
		System.out.println("The sum is : "+ob.sum(50, 60));
	}
}
