package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	public static void main(String[] args) {
		BootClass boot = new BootClass();
		boot.menuSelection();
		
	}

	public void menuSelection(){
		
		UserInteraction obj = new UserInteraction();
		
		System.out.println("1. AddEmployee");
		System.out.println("2. ModifyEmployee");
		System.out.println("3. RemoveEmployee");
		System.out.println("4. SearchEmployee");
		System.out.println("5. getAllEmployee");
		
	Scanner sc = new Scanner(System.in);
	int sw = sc.nextInt();
	
	switch(sw){
	case 1:
		obj.AddEmployee();
		break;
		
	case 2:
		obj.ModifyEmployee();
		break;
		
	case 3:
		obj.RemoveEmployee();
		break;
		
	case 4:
		obj.SearchEmployee();
		break;
		
	case 5:
		obj.getAllEmployee();
		break;
		
		default:
			System.out.println();
		
		
	}
	}
}
