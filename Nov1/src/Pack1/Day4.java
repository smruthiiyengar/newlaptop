package Pack1; // Methods Assignment 1

public class Day4 {
	//pillar 1 - methods and var
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		return c;
	}
	public int sum1(int d, int e)
	{
		int f;
		f = d  + e;
		return f;
	}
	public int sub(int g, int h)
	{
		int i;
		i = g - h;
		return i;
	}
	public int mul(int j, int k)
	{
		int l;
		l = j*k;
		return l;
	}
	public int div(int m, int n)
	{
		int o;
		o = m/n;
		return o;
	}
	

	//pillar 2 - main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4 obj = new Day4();
		int s1 = obj.sum(10, 2);
		int s2 = obj.sum1(s1, 2);
		int res_sub = obj.sub(s2, 2);
		int r_mul = obj.mul(res_sub,2);
		int result = obj.div(r_mul, 2);
		System.out.println(result);

	}

}
