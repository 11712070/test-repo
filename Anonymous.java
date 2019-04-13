class Age
{
	int x=20;
	void getAge()
	{
		System.out.println("Hello");
	}
}
class Anonymous
{
	public static void main(String[] args)
	{
		Age oj1=new Age()
		{
			public void getAge()
			{
				System.out.print("Age is "+x);
			}
		};
		oj1.getAge();
	}
}