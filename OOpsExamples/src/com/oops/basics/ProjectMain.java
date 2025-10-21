package com.oops.basics;

public class ProjectMain {
	
	public static void main(String[] args) {
		
		Project prj = new Project();
		
		String [] show = prj.showTools();
			for(String val:show) {
			System.out.println(val);
			}
			
			String info=prj.projectInfo();
			System.out.println(info);
		
		
	}
		
}
