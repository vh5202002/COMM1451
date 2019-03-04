package a01040431_lab08a;


public class EmployeeDriver {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
	
		
		Company Employees = new Company();
		
		Employee e1_1 = new HourlyEmployee ("Choya",40);
		Employee e1_2 = new CommissionEmployee("Choya", 0.4, 6000);
		Employee e1_3 = new SalariedEmployee("Choya",40);
		Employee e2 = new CommissionEmployee ("Web", 0.2, 5400);
		Employee e3 = new SalariedEmployee("Vivi",30);
		
		System.out.println("-------------display add----------------------");
		
		Employees.addEmployee(e1_1);
		Employees.addEmployee(e1_2);
		Employees.addEmployee(e1_3);
		Employees.addEmployee(e2);
		Employees.addEmployee(e3);
		
		Employees.displayAllEmployee();
		
		System.out.println("-------------display remove----------------------");
	
		Employees.removeEmployee("Choya");
		
		Employees.displayAllEmployee();
	
	
	}

}
