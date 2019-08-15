public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary<0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return baseSalary+super.earnings();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s %s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: $%.2f%n","Base Salary Plus Commissioned Employee", getFirstName(), getLastName(),"with ssn",	getSocialSecurityNumber(), "Gross Sales", getGrossSales(), "Commission Rate",getCommissionRate(),"with Base Salary of", getBaseSalary(),"Earnings", earnings());
	}
}

