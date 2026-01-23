package com.ibm.oops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.PermanentEmployee;

public class Application
{
	public static void main( String[] args )
	{
		Employee emp = new PermanentEmployee();
		emp.netPay();
		
		float f = (float)3.0;
		
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTimeZone());
		
		GregorianCalendar gregorianCalendar = (GregorianCalendar)calendar;
		System.out.println(gregorianCalendar.getCalendarType());
		
		List<Integer> list = new ArrayList<Integer>();
		if(list instanceof ArrayList) {
			ArrayList<Integer> array = (ArrayList<Integer>)list;
		}
	}
}