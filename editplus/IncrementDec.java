class IncrementDec 
{
	public static void main(String[] args) 
	{

		/*
		int a=10;
		a++; //11 post increment
		++a; //12 pre increment
		System.out.println(a);

		int b=5;
		++b;
		System.out.println(b);
		*/

		int c= 6;
		//mera 6 + 8 + 9 + 9 + 11 = 43
		int res = c++ + ++c + ++c + c++ + ++c;
		System.out.println(res); //14

		//post


		int a=-6;
		int r = a++ + --a + a-- + ++a;
		System.out.println(r);

	}
}
