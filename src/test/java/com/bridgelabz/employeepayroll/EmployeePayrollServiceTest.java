package com.bridgelabz.employeepayroll;

import java.util.Arrays;

import org.junit.Test;

import com.bridgelabz.employeepayroll.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {
	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries()
	{
		EmployeePayroll[] arrayOfEmployees = {
				new EmployeePayroll(1, "Jeff Bezos", 100000.0),
				new EmployeePayroll(2, "Bill Gates", 200000.0),
				new EmployeePayroll(3, "Mark Zuckerberg", 300000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		employeePayrollService.writeEmployeeData(IOService.FILE_IO);
		
	}
}
