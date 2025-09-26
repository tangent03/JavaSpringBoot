class LogicalOperator 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b=false;
		System.out.println("a && b = "+ (a&&b));
		System.out.println("a || b = "+ (a||b));
		System.out.println("!a= "+ (!a));

		int marks =32;
		String res = (marks>33) ? "Pass" : "fail";
		System.out.println(res);
	}
}
