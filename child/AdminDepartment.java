package com.greatlearning.oopsassignment.child;

import com.greatlearning.oopsassignment.parent.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String departmentName()
	{return "Admin Department";}
	public String getTodaysWork()
	{return "Complete your document Submission";}
	public String getWorkDeadline()
	{return "Complete by EOD";}

}
