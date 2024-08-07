/*1.	Write a program to implement method overloading to compute area of Rectangle, square and triangle*/
import java.util.Scanner;


class area
{
	public static void main(String a[])
	{
		area square = new area();
		area triangle =new area();
		area rectangle=new area();
		square.area();
		System.out.println("enter l and b");
		Scanner scanf=new Scanner(System.in);
		int x=scanf.nextInt();
		int y=scanf.nextInt();
		rectangle.area(x,y);
		
		System.out.println("enter height and base");
		double h=scanf.nextDouble();
		double b=scanf.nextDouble();
		triangle.area(h,b);
		
		System.out.println("enter side of square");
		int s=scanf.nextInt();
		square.area(s);
	}
	public void area()
	{	System.out.println("enter side of square");
		Scanner scanf= new Scanner(System.in);
		int s=scanf.nextInt();
		int area=s*s;
		System.out.println("the area of square is"+area);
	}
	public void area(int x)
	{
		int area=x*x;
		System.out.println("the area of square is"+area);
	}
	public void area(int x, int y)
	{
		int area=x*y;
		System.out.println("the area of rectangle is"+area);
	}
	public void area(double x, double y)
	{
		double area=(0.5)*x*y;
		System.out.println("the area of triangle is"+area);
	}
}