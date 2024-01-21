package Pack1; //Constructor Concept

public class Day3 {
	//cons is like method
	// no return type
	// cons name and class name are same
	// no obj need to be created when constructor is used
	
	public Day3() 
	{
		System.out.println("This is default Constructor");
	}
	public Day3(int a) 
	{
		this(22,21); // this will be executed first
		System.out.println("One parameterized Constructor");
	}
	public Day3(int a, int b) 
	{
		this(); // this can be written only once and this should be the first stmt in cons not last
		System.out.println("two parameterized constructor");
	}
	public Day3(int a, int b, int c) {
		System.out.println("Three param constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3 obj = new Day3(100,11,1);
		//Day3 obj1 = new Day3();
		Day3 ob3 = new Day3(11);

	}

}
