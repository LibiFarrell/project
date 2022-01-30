package encapsulation.pack;

public class Family {
	private int age;
	private String name;
	private int dob;
	private String occupation;
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDob(int dob)
	{
		this.dob=dob;
	}
	public void setOccupation(String occupation)
	{
		this.occupation=occupation;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public int getDob()
	{
		return dob;
	}
	public String getOccupation()
	{
		return occupation;
	}
}
