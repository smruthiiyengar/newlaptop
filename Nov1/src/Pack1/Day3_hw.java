package Pack1; // constructor Assignment

public class Day3_hw 
{
	public Day3_hw()
	{
		this(10,1,2,4);
		System.out.println("Default cons");
	}
	public Day3_hw(int a)
	{
		System.out.println("One parametrized cons");
	}
	public Day3_hw(int a, int b)
	{
		this(2,3,1);
		System.out.println("Two params cons");
	}
	public Day3_hw(int a, int b, int c)
	{
		System.out.println("Three params cons");
	}
	public Day3_hw(int a, int b, int c, int d)
	{
		//this();
		System.out.println("Four params cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_hw obj1 = new Day3_hw();
		Day3_hw ob2 = new Day3_hw(3);
		Day3_hw ob3 = new Day3_hw(1,4);

	}

}
