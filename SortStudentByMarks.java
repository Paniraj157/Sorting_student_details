package com.jsp.pkg1;

import java.util.Comparator;

public class SortStudentByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()-o2.getMarks();
	}
	
	
	

}
