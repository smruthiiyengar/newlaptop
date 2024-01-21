package Pack1; // Obj pillars concept

public class Day2 
{ 
	//pillar 1 -- create variable and methods inside the class
	int a;
	public void smru()
	{
		System.out.println("Hello World Function");
	}

	public static void main(String[] args) //pillar 2 - create main method 
	{
		// Pillar 3 - create object inside main method
	Day2 obj = new Day2();
	//Pillar 4 call the obj using ref variable "obj"
	obj.a = 10;
	obj.smru();
	System.out.println("value of a is "+obj.a);
	obj.a = 2323;
	System.out.println("value of a is "+obj.a);
	}

}
