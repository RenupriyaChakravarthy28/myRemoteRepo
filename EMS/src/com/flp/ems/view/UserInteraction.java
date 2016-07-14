package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

public class UserInteraction {

	
    public void AddEmployee(){
    	System.out.println("Employee details : \n");
    	Scanner ui = new Scanner(System.in);
    	System.out.println("Name of the Employee : ");
    	String empName = ui.nextLine();
    	System.out.println("Employee ID : ");
    	int empID = ui.nextInt();
   		System.out.println("KIN ID : ");
    	String empKin = ui.next();
    	System.out.println("Email ID : ");
    	String empEmail = ui.next();
    	System.out.println("Phone no : ");
    	long empPh = ui.nextLong();
    	System.out.println("Date of Birth : ");
    	String empDoB = ui.next();
    	System.out.println("Date of Joining : ");
    	String empDoJ = ui.next();
    	System.out.println("Address : ");
    	String empAddress = ui.next();
    	
    	Department dep = new Department();
    	dep.dept();
    	
    	/*System.out.println("Department ID : ");
    	int empDeptID = ui.nextInt();
    	System.out.println("Project ID : ");
    	int empProjID = ui.nextInt();
    	System.out.println("Roles ID : ");
    	int empRoleID = ui.nextInt();*/
    	
    	HashMap hm = new HashMap();
    	hm.put("Employee Name", empName);
    	hm.put("Employee ID", empID);
    	hm.put("KIN ID", empKin);
    	hm.put("Email ID", empEmail);
    	hm.put("Phone No", empPh);
    	hm.put("DOB", empDoB);
    	hm.put("DOJ", empDoJ);
    	hm.put("Address", empAddress);
    	
    	/*hm.put("Dept ID", empDeptID);
    	hm.put("proj ID", empProjID);
    	hm.put("Role Id", empRoleID);*/
    	
    	    	
    }

    public void  ModifyEmployee(){
    	
    }

    public void  RemoveEmployee(){
    	
    }

    public void  SearchEmployee(){
	 
 }

    public void  getAllEmployee(){
 	 
 }
}
