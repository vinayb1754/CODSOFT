package javaInternship;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student marks subject wise::");
		System.out.print("marks in Telugu:");
		int telugu=sc.nextInt();
		
		System.out.print("marks in Hindi:");
		int hindi=sc.nextInt();

		System.out.print("marks in English:");
		int english=sc.nextInt();

		System.out.print("marks in Maths:");
		int maths=sc.nextInt();

		System.out.print("marks in Science:");
		int science=sc.nextInt();
		
		System.out.print("marks in Social:");
		int social=sc.nextInt();
		
		int total=telugu+hindi+english+maths+science+social;
		
		
		float avg=total/6;
		
		System.out.println("Total marks="+total);
		System.out.println("Average percentage="+avg);
		
		
		if(avg>=91) {
			System.out.println("Grade=0");
		}
		else if(avg<=90 && avg>80) {
			System.out.println("Grade=A+");
		}
		else if(avg<=80 && avg>70) {
			System.out.println("Grade=A");
		}
		else if(avg<=70 && avg>60) {
			System.out.println("Grade=B+");
		}
		else if(avg<=60 && avg>50) {
			System.out.println("Grade=B");
		}
		else if(avg<=50 && avg>40) {
			System.out.println("Grade=C");
		}
		else 
		{
			System.out.println("grade=F");
		}
		
		
		
		sc.close();	


	}

}
