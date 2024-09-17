package com.tka.service;

import java.util.ArrayList;

import com.tka.dao.ClassroomDao;
import com.tka.entity.Classroom;

public class ClassroomService {

	public ArrayList<Classroom> getAllClassroomsDetails() {
		ClassroomDao classroomDao = new ClassroomDao();
		ArrayList<Classroom> listcls = classroomDao.fetchAllClassrooms();
		return listcls;
	}

	public static Classroom getClassroomDetailperID(int clsId) {
		ClassroomDao classroomDao = new ClassroomDao();
		Classroom classroomNew = new Classroom();
		ArrayList<Classroom> listcls = classroomDao.fetchAllClassrooms();
		for (Classroom classroom : listcls) {
			if (clsId == classroom.getClsId()) {
				classroomNew.setClsId(classroom.getClsId());
				classroomNew.setClsName(classroom.getClsName());
			}
		}

		if (classroomNew.getClsName() == null) {
			classroomNew.setClsName("NOT EXIST Please enter another classroom");
		}
		return classroomNew;
	}

	public static void deleteClassroomDetailsAboveCapacity(int capacity) {
		System.out.println("I am in service - deleteClassroomDetailsAboveCapacity");
		ClassroomDao classroomDao = new ClassroomDao();
		classroomDao.deleteClassroomDetailsAboveCapacity(capacity);
	}

	Classroom updateClassroomDetailsAboveCapacity(int clsId, String clsName) {
		return null;
	}

	Classroom getClassroomDetailperNAME(String clsName) {
		return null;
	}

	Classroom getClassroomDetailperSIZE(int size) {
		return null;
	}

	Classroom getClassroomDetailperFloor(int florNumber) {
		return null;
	}

	Classroom getClassroomDetailsAboveCapacity(int capacity) {
		return null;
	}
}
