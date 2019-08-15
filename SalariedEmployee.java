
public class SalariedEmployee extends Employees{
	private double salary;
	
	public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber, double salary)
	{
		super(firstName,lastName,socialSecurityNumber);
		if (salary<0.0)
			throw new IllegalArgumentException("Salary must be >= 0.0");
		this.salary=salary;
	}
	public void setSalary(double salary) 
	{
		if (salary<0.0)
			throw new IllegalArgumentException("Salary must be >= 0.0");
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public double earnings()
	{
		return getSalary();
	}
	
	@Override 
	public String toString()
	{
	return String.format("%s: %s %s %s: %s%n%s: %.2f%n%s: $%.2f%n", "Salaried Employee", getFirstName(), getLastName(),"with ssn ", getSocialSecurityNumber(),"Salary",getSalary(),"Earnings",earnings());
	}
}
