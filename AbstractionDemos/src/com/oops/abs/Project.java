package com.oops.abs;

public class Project {

	public static void main(String[] args) {
		
		TeamLead teamlead = new GroupOne();
		teamlead.doTask();
		
		GroupOne groupOne =(GroupOne)teamlead;
		groupOne.printTools();
		
		teamlead = new GroupTwo();
		teamlead.doTask();
		teamlead.projectInfo();
	}
}
