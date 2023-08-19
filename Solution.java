package com.jsp.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args)
	{
		Student s1 = new Student(20,"Jack",76);
		Student s2 = new Student(30,"Rocky",58);
		Student s3 = new Student(40,"Hari",65);
		Student s4 = new Student(50,"Ram",32);
		Student s5 = new Student(60,"Raj",12);
		
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		
		//convert map into a set of keys
		Set <Integer> keys = map.keySet();
		System.out.println("Entries present inside Map");
		for(int key : keys) {
			System.out.println(map.get(key)); //printing s1 s2 s3 s4 s5
		}
		System.out.println("......................");
		
		// Add the values from the Map into Arraylist
		List<Student> l = new ArrayList<Student>();
		for(int key : keys) {
			Student obj = map.get(key);//Student obj = new Student(10,"A",23);
			l.add(obj); //l.add(map.get(key));//getting s1 s2 s3 s4 s5
		}
		System.out.println("Objects preset in List");
		for(Student s: l) {
			System.out.println(s);
		}
		System.out.println(".................");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1:sort by Id\n2:sort by Name");
		System.out.println("3:Sort by Marks");
		System.out.println("Enter choice:");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new StudentSortById());
			for(Student s: l) {
				System.out.println(s);
			}
			break;
		case 2:
			Collections.sort(l, new SortStudentByName());
			for(Student s: l) {
				System.out.println(s);
			}
			break;
		case 3:
			Collections.sort(l, new SortStudentByMarks());
			for(Student s: l) {
				System.out.println(s);
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
