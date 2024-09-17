package com.tka.client;

import java.util.ArrayList;
import java.util.Iterator;

import com.tka.controller.ClassroomController;
import com.tka.entity.Classroom;

public class CLient {
	public static void main(String[] args) {

		//ArrayList<Classroom> arrayListCls = ClassroomController.fetchAllClassrooms();
		//for (Classroom classroom : arrayListCls) {
		//	System.out.println(classroom);
		//}
		/*
		 * Classroom classroom = ClassroomController.getClassroomDetailperID(7777);
		 * System.out.println(classroom);
		 */
		
		
		ClassroomController.deleteClassroomDetailsAboveCapacity(34);
		
		
		
		
		
		
	}
}
