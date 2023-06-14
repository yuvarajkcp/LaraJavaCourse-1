package com.lara.employees;
import com.lara.students.StudentsData;
class EmployeeData 
{
	public static void main(String[] args) 
	{
		System.out.println("src.com.lara.employees.EmployeeData");
		StudentsData sd1 = new StudentsData();
		StudentsData sd2 = new StudentsData();
		StudentsData sd3 = new StudentsData();
		StudentsData sd4 = new StudentsData();
	}
}
/*
D:\april-batch-lab\packages\app1\src>javac -d ../classes com/lara/employees/EmployeeData.java

D:\april-batch-lab\packages\app1\src>java -cp ../classes com.lara.employees.EmployeeData
src.com.lara.employees.EmployeeData
*/