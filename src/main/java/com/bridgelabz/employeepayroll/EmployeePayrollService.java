package com.bridgelabz.employeepayroll;

import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	List<EmployeePayroll> employeePayrollList;

	public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
		super();
		this.employeePayrollList = employeePayrollList;
	}

	void readEmployeePayrollData(Scanner ConsoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = ConsoleInputReader.nextInt();

		System.out.println("Enter Employee Name: ");
		String name = ConsoleInputReader.next();

		System.out.println("Enter Employee Salary: ");
		double salary = ConsoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayroll(id, name, salary));
	}

	void writeEmployeeData(IOService ioService) {
		if(ioService.equals(IOService.CONSOLE_IO))
			System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
		
		else if(ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeData(employeePayrollList);
	}
		
	public void printData(IOService fileIo) {
		if(fileIo.equals(IOService.FILE_IO)) new EmployeePayrollFileIOService().printData();
	}


	public long countEntries(IOService fileIo) {
		if(fileIo.equals(IOService.FILE_IO)) return new EmployeePayrollFileIOService().countEntries();
		
		return 0;
	}
}
