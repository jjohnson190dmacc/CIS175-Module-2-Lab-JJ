package model;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 19, 2024
 */

public class EmpBusinessLogic {

	public double calculateYearlySalary(Employee employee) {
		
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary()*12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		
		double appraisal = 0;
		if(employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}


	public boolean isRetirementAge(Employee employee) {
		
		if(employee.getAge() > 65) {
			return true;
		} else {
			return false;
		}
	}
}
