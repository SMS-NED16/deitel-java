// PayrollSystemTest.java
// Employee hierarchy test program
package payroll;

public class PayrollSystemTest
{
	public static void main( String[] args )
	{
		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee(
				"John", "Smith", "111-11-1111", 800.00 );
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee( 
				"Karen", "Price", "222-22-2222", 16.75, 40 );
		
		CommissionEmployee commissionEmployee = new CommissionEmployee(
				"Sue", "Jones", "333-33-3333", 10000, .06 );
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = new 
				BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 
						5000, .04, 300 );
		
		// Output the details of each Employee non-polymorphically
		System.out.println( "Employees processed individually:\n" );
		
		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				salariedEmployee, "earned", salariedEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				hourlyEmployee, "earned", hourlyEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				commissionEmployee, "earned", commissionEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				basePlusCommissionEmployee, "earned", 
				basePlusCommissionEmployee.earnings() );
		
		// create a four-element Employee array
		Employee[] employees = new Employee[ 4 ];
		
		// initialise the array with employees
		employees[ 0 ] = salariedEmployee;
		employees[ 1 ] = hourlyEmployee;
		employees[ 2 ] = commissionEmployee;
		employees[ 3 ] = basePlusCommissionEmployee;
		
		System.out.println( "Employees processed polymorphically\n\n" );
		
		// generically process each element in array employees
		for ( Employee currentEmployee : employees )
		{
			System.out.println( currentEmployee );
			
			// deterine whether current elemetn is a BasePlusCommissionEmployee
			if ( currentEmployee instanceof BasePlusCommissionEmployee )
			{
				// downcast Employee reference to BasePlusCommissionEmployee
				BasePlusCommissionEmployee employee = 
						 ( BasePlusCommissionEmployee ) currentEmployee;
				
				// increment salary by 10%
				employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
				
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n", 
						employee.getBaseSalary() );
			}	// end if block to handle basePlusCommissionEmployee
			
			// Output the current employee polymorphically
			System.out.printf(
					"earned $%,.2f\n\n", currentEmployee.earnings() );
		}	// end for loop to process Employees polymorphically
		
		// get type name for each object in Employee array
		for ( int j = 0; j < employees.length; j++ )
			System.out.printf( "Employee %d is a %s\n", 
					j, employees[ j ].getClass().getName() );
	}	// end method main
}	// end class PayrollSystemTest