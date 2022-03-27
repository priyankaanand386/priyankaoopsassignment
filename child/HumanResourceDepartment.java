package com.greatlearning.oopsassignment.child;

import com.greatlearning.oopsassignment.parent.SuperDepartment;

public class HumanResourceDepartment extends SuperDepartment {
	public String departmentName()
	{return "HR Department";}
	public String getTodaysWork()
	{return "Fill today's worksheet and mark your attendence";}
	public String getWorkDeadline()
	{return "Complete by EOD";}
	public String doActivity()
	{return "Team lunch";}
}
