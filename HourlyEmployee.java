public class HourlyEmployee extends Employees {

	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked)
	{
		super(firstName, lastName, socialSecurityNumber);
		if (hourlyWage <0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		if (hoursWorked <1.0 || hoursWorked>168.0)
			throw new IllegalArgumentException("Hours worked must be >=1.0 and <=168.0");
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	public void setHourlyWage(double hourlyWage)
	{
		if (hourlyWage <0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.hourlyWage = hourlyWage;
	}
	public double getHourlyWage()
	{
		return hourlyWage;
	}
	public void setHoursWorked(double hoursWorked)
	{
		if (hoursWorked <1.0 || hoursWorked>168.0)
			throw new IllegalArgumentException("Hours worked must be >=1.0 and <=168.0");
		this.hoursWorked = hoursWorked;
	}
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	public double earnings()
	{
		if(getHoursWorked()<=40.0)
			return getHourlyWage()*getHoursWorked();
		else
			return (40*getHourlyWage())+(getHourlyWage()*(getHoursWorked()-40)*1.5);
	}
	
	@Override 
	public String toString()
	{
	return String.format("%s: %s %s %s: %s%n%s: %.2f%n%s: %.2f%n%s: $%.2f%n", "Hourly Employee", getFirstName(), 
			getLastName(),"with ssn", getSocialSecurityNumber(),"Hourly Wage",getHourlyWage(),"Hours Worked",
			getHoursWorked(),"Earnings",earnings());
	}
}
