
public class Employees {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public Employees(String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	/*public Employees(String firstName2, String lastName2, String socialSecurityNumber2) {
		// TODO Auto-generated constructor stub
	}*/
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	@Override 
	public String toString()
	{
	return String.format("%s: %s %s%n%s: %s%n%s:", "employee", getFirstName(), getLastName(),"social security number", getSocialSecurityNumber());
	}
}
