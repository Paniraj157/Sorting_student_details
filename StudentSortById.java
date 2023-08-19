package com.jsp.pkg1;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student>{
	
	@Override
	public int compare(Student x, Student y) {
		return x.getId() - y.getId();
	}

}
