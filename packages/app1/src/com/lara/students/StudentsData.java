package com.lara.students;
public class StudentsData 
{
	public static void main(String[] args) 
	{
		System.out.println("src.com.lara.students.StudentsData");
	}
}



//without package it will create class file in classes without directory
/*
D:\april-batch-lab\packages\app1\src>javac -d ../classes com/lara/students/StudentsData.java

D:\april-batch-lab\packages\app1\src>java -cp ../classes com.lara.students.StudentData
src.com.lara.students.StudentsData
*/
