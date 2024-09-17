package com.tka.controller;

import java.util.ArrayList;

import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;
import com.tka.util.ValidationUtility;

public class ClassroomController {

	public static ArrayList<Classroom> fetchAllClassrooms() {
		ClassroomService classroomService = new ClassroomService();
		return classroomService.getAllClassroomsDetails();
	}

	public static void deleteClassroomDetailsAboveCapacity(int capacity) {
		if (!ValidationUtility.isNumberZero(capacity)) {
			System.out.println("I am in controller - deleteClassroomDetailsAboveCapacity");
			ClassroomService classroomService = new ClassroomService();
			classroomService.deleteClassroomDetailsAboveCapacity(capacity);
		}
	}

	public static Classroom getClassroomDetailperID(int clsId) {
		Classroom classroom = null;
		if (!ValidationUtility.isNumberZero(clsId)) {
			ClassroomService classroomService = new ClassroomService();
			classroom = classroomService.getClassroomDetailperID(clsId);
		}

		/*
		 * boolean bb=ValidationUtility.isNumberZero(clsId); if (! bb) {
		 * ClassroomService classroomService = new ClassroomService(); classroom =
		 * classroomService.getClassroomDetailperID(clsId); }
		 */
		return classroom;
	}

	System.out.println("abc");

}
