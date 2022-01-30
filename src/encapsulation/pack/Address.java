package encapsulation.pack;

public class Address {
private String line1;
private String street;
private int pincode;
public void setLine1(String line1)
{
	this.line1=line1;
}
public void setStreet(String street) {
	this.street=street;
}
public void setPincode(int pincode)
{
	this.pincode=pincode;
}
public String getLine1()
{
	return line1;
}
public String getStreet()
{
	return street;
}
public int getPincode()
{
	return pincode;
}
}
