package Pack1; // Methods - Assignment 2

public class Day4_1 {
	public int mul(int a, int b)
	{
		int c;
		c = a*b;
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f = d - e;
		return f;
	}
	public int sum(int g, int h)
	{
		int i;
		i = g + h;
		return i;
	}
	public int sub1(int j, int k)
	{
		int l;
		l = j - k;
		return l;
	}
	public int div(int m, int n)
	{
		int o;
		o = m/n;
		return o;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_1 obj = new Day4_1();
		int m1 = obj.mul(10, 2);
		int m2 = obj.sub(m1, 2);
		int m3 = obj.sum(m2, 2);
		int m4 = obj.sub1(m3, 2);
		int m5 = obj.div(m4, 2);
		System.out.println(m5);

	}

}
