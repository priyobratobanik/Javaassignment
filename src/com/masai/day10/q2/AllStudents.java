package com.masai.day10.q2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student h1=new HistoryStudent();
		HistoryStudent h=(HistoryStudent)h1;
		Student s1=new ScienceStudent();
		ScienceStudent s=(ScienceStudent)s1;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter history marks");
		int hm=scanner.nextInt();
		h.setHistoryMarks(hm);
		System.out.println("enter civic marks");
		int cm=scanner.nextInt();
		h.setCivicsMarks(cm);
		
		h.getPercentage();
		
		
		System.out.println("enter physics marks");
		int pm=scanner.nextInt();
		s.setPhysicsMarks(pm);
		
		
		System.out.println("enter chemistry marks");
		int chem=scanner.nextInt();
		s.setChemistryMarks(chem);
		
		
		System.out.println("enter maths marks");
		int m=scanner.nextInt();
		s.setMathsMarks(m);
		
		
		
		
		
		
		
		s.getPercentage();

	}

}
