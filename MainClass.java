package com.greatlearning.oopsassignment;

import com.greatlearning.oopsassignment.child.AdminDepartment;
import com.greatlearning.oopsassignment.child.HumanResourceDepartment;
import com.greatlearning.oopsassignment.child.TechDepartment;

public class MainClass {

	public static void main(String[] args) {
		// objects
		AdminDepartment adminDepartment= new AdminDepartment();
		HumanResourceDepartment humanresourceDpartment=new HumanResourceDepartment();		
		TechDepartment techDepartment=new TechDepartment();
		
		//Methods called in Administration Department
		System.out.println("Welcome to "+ adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
		
		//Methods called in HumanResouce Department
		System.out.println("Welcome to "+ humanresourceDpartment.departmentName());
		System.out.println(humanresourceDpartment.doActivity());
		System.out.println(humanresourceDpartment.getTodaysWork());
		System.out.println(humanresourceDpartment.getWorkDeadline());
		System.out.println(humanresourceDpartment.isTodayAHoliday());
		System.out.println();
		
		//Methods called in Tech Department
		System.out.println("Welcome to "+ techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println();
		
	}

}
