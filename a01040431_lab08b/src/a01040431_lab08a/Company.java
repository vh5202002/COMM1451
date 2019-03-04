/**
 * 
 */
package a01040431_lab08a;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author choya
 *
 */
public class Company {
	private ArrayList<Employee> employees;
	
	/**
	 * 
	 */
	public Company() {
		employees = new ArrayList<Employee>();
	}
	
	/**
	 * add employee to arrayList
	 */
	public void addEmployee(Employee employee) {
		if(employee != null) {
			employees.add(employee);
		}
	}
	
	/**
	 * remove by Employee's name 
	 * @param name to remove the Employee
	 */
	public void removeEmployee(String name) {
		
		Iterator<Employee> index = employees.iterator();
		while(index.hasNext()) {
			Employee employee = index.next();
			if(employee.getName().equals(name)) {
				index.remove();
			}
		}
		
	}
	
	/**
	 * display all employees
	 */
	public void displayAllEmployee() {
		for(Employee emp : employees) {
			System.out.println("Employee Name: "+ emp.getName() + "--- Monthly Earnings: " + emp.calculateMonthlyEarnings());
			
			
		}
	}

}
