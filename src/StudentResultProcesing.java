//IMPORT SCANNER CLASS TO TAKE THE INPUTS FROM USER
import java.util.Scanner;
public class StudentResultProcesing extends Student {
	
// MAIN METHOD FOR STUDENTRESULTPROCESSING CLASS
	public static void main(String[] args) {
		//DECLARE VARIABLES OF TYPE INT FOR TAKING INPUT FOR SUBJECT MARKS
		int sub1Marks;
		int sub2Marks;
		int sub3Marks;
		//INITIATE THE SCANNER CLASS FOR TAKING INPUT FROM USER
		Scanner scanInput =new Scanner(System.in);
		
		//INITIATE THE CLASS 
		StudentResultProcesing stdResult=new StudentResultProcesing();
		
		//PRINT THE MESSAGE FOR USER TO ENTER THE STUDENT NAME 
		System.out.println("Please Enter the Studet Name");
		//REQUEST FOR USER TO ENTER THE STUDENT NAME 
		stdResult.setStrName(scanInput.nextLine());
		//PRINT THE MESSAGE FOR USER TO ENTER THE STUDENT PHONE NUMBER
		System.out.println("Please Enter the Studet Phone Number");
		//REQUEST FOR USER TO ENTER THE STUDENT PHONE NUMBER 
		stdResult.setPhoneNumber(scanInput.nextLine());
		//PRINT THE MESSAGE FOR USER TO ENTER THE STUDENT ROLL NUMBER
		System.out.println("Please Enter the Studet Roll Number");
		//REQUEST FOR USER TO ENTER THE STUDENT ROLL NUMBER
		stdResult.setRollNumber(scanInput.nextInt());
		//PRINT THE MESSAGE FOR USER TO ENTER THE STUDENT CLASS
		System.out.println("Please Enter the Studet Class");
		//REQUEST FOR USER TO ENTER THE STUDENT CLASS 
		stdResult.setClassName(scanInput.nextLine());
		stdResult.setClassName(scanInput.nextLine()); // ANY LINE INPUT AFTER OTHER DATA TYPES NEED TO SPECITY TWICE 
		
		//PRINT THE MESSAGE FOR USER TO ENTER THE MARKS FOR SUBJECT 1
		System.out.println("Enter the marks for Subject 1");
		//REQUEST COMMAND FOR USER TO ENTER THE MARKS FOR SUBJECT 1
		sub1Marks=scanInput.nextInt();
		//PRINT THE MESSAGE FOR USER TO ENTER THE MARKS FOR SUBJECT 2
		System.out.println("Enter the marks for Subject 2");
		//REQUEST COMMAND FOR USER TO ENTER THE MARKS FOR SUBJECT 2
		sub2Marks=scanInput.nextInt();
		//PRINT THE MESSAGE FOR USER TO ENTER THE MARKS FOR SUBJECT 3
		System.out.println("Enter the marks for Subject 3");
		//REQUEST COMMAND FOR USER TO ENTER THE MARKS FOR SUBJECT 3
		sub3Marks=scanInput.nextInt();
		
		//PRINTING THE STUDENT DETAILS 
		System.out.println("STUDENT DETAILS WITH RESULT");
		System.out.println("----------------------------");
		System.out.println("Student Name	: " + stdResult.getStrName());  // DISPLAYING STUDENT NAME
		System.out.println("Roll Number	: " + stdResult.getRollNumber()); // DISPLAYING ROLL NUMBER 
		System.out.println("Class		: " + stdResult.getClassName());  // DISPLAYING STUDENT CLASS
		System.out.println("Phone Number	: " + stdResult.getPhoneNumber()); // DISPLAYING STUDENT PHONE NUMBER 
		System.out.println("Result		: " + stdResult.Result(sub1Marks,sub2Marks,sub3Marks) ); // DISPLAYING RESULT
		
		scanInput.close();
		
	}

}
