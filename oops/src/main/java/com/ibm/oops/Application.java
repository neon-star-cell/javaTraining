package com.ibm.oops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.PermanentEmployee;

public class Application
{
	public static void main( String[] args )
	{
		Employee emp = HR.recruit("i");
		if(emp != null) {
			emp.netPay();
		}
		
		emp = HR.recruit("p");
		if(emp != null) {
			emp.netPay();
		}
	}
}