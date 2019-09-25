package ICS4U_Unit1;

public class Person {
	String name;
	int age;
	double height;
	String dateOfBirth;
	
	/*
	public Person(String n)
	{
		name = n;
	}
	
	private Person(int a, double h)
	{
		age = a;
		height = h;
	}
	
	protected Person(String d)
	{
		dateOfBirth = d;
	}
	*/
	
	public Person()
	{
		name = "Ted";
		age = 15;
		height = 173;
		dateOfBirth = "11, 28, 2001";
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public String getDoB()
	{
		return dateOfBirth;
	}
	
	public void setDoB(String d)
	{
		dateOfBirth = d;
	}
	
	
	
	public void hasBirthday()
	{
		age++;
		System.out.println("Happy birthday " + name + "!!");
		System.out.println("You are " + age + " years old!");
	}
	
	public void measureHeight()
	{
		System.out.println("You are " + height + " cm tall!");
		
	}
	
	public String toString(Person p)
	{
		String q = name + " , " + age + " , " + height + " , " + dateOfBirth;
		return q;
	}
	
	public Boolean equals(Person p)
	{
		if(p.height == this.height && p.dateOfBirth == this.dateOfBirth && p.name == this.name && p.age == this.age)
		{
			return true;
		}
		return false;
	}
	
	
}
