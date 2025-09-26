class Student 
{
	//instance
	String name="Nazia";
	int age =24;
	static String course = "Java";

	public static void main(String[] args) 
	{
		/*
		System.out.println("Name "+ name);
		System.out.println("age "+ age);
		*/
		Student s=new Student();
		System.out.println("Name "+ s.name);
		System.out.println("age "+ s.age);
		System.out.println("course "+ s.course);

		s.name="Ashwani";
		s.course="DSA";
		System.out.println("Name "+ s.name);
		System.out.println("course "+ s.course);


		System.out.println("-----------------------------------------------");
		Student s1=new Student();
		System.out.println("Name "+ s1.name);
		System.out.println("age "+ s1.age);
		System.out.println("course "+ s1.course);

		s1.name="Himadri";

		s.display();
		s1.display();
	}

	public void display()
	{
		String name = "salman";
		System.out.println("Name "+ name);
	}
}
