package ICS4U_Unit1;

public class Student extends Person{
	
	String advisor;
	int grade;
	int yearsAtSchool;
	int idNumber;
	
	private Student(String a, int g, int y, int i)
	{
		advisor = a;
		grade = g;
		yearsAtSchool = y;
		idNumber = i;
	}
	
	public Student()
	{
		advisor = "Tim Hutton";
		grade = 12;
		yearsAtSchool = 4;
		idNumber = 66810;
	}
	
	
	public String getAdvisor()
	{
		return advisor;
	}
	
	public void setAdvisor(String a)
	{
		advisor = a;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int g)
	{
		grade = g;
	}
	
	public int getYearsAtSchool()
	{
		return yearsAtSchool;
	}
	
	public void setYearsAtSchool(int y)
	{
		yearsAtSchool = y;
	}
	
	public int getIDNumber()
	{
		return idNumber;
	}
	
	public void setIDNumber(int i)
	{
		idNumber = i;
	}
	
	public String toString(Student s)
	{
		String q = name + " , " + age + " , " + height + " , " + dateOfBirth;
		return q;
	}
	
	public Boolean equals(Student s)
	{
		if(s.height == this.height && s.dateOfBirth == this.dateOfBirth && s.name == this.name && s.age == this.age)
		{
			return true;
		}
		return false;
	}
	
	
	
	
}
