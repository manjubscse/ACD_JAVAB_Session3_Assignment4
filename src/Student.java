
public class Student {

	String strName;
	String phoneNumber;
	int rollNumber;
	String className;

	
	// SETTER FOR VARIABLE STRNAME
	public String getStrName() {
		return strName;
	}
	// GETTER FOR VARIABLE STRNAME
	public void setStrName(String strName) {
		this.strName = strName;
	}
	// SETTER FOR VARIABLE PHONENUMBER
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// GETTER FOR VARIABLE PHONE NUMBER
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	// SETTER FOR VARIABLE ROLL NUMBER
	public int getRollNumber() {
		return rollNumber;
	}
	// GETTER FOR VARIABLEE ROLL NUMBER
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	// SETTER FOR VARIABLE CLASS NAME
	public String getClassName() {
		return className;
	}
	// GETTER FOR VARIABLE CLASS NAME
	public void setClassName(String className) {
		this.className = className;
	}

	// METHOD FOR TAKING THE MARKS AS INPUT FOR 3 SUBJECTS AND RETURN RESULT AS STRING
	public String Result(int sub1Marks,int sub2Marks,int sub3Marks) {
		// DECLARE VARIABLE OF TYPE STRING
		String finalResult;
		// IF THE MARKS OF ALL THE SUBJECTS GREATER THE 35  THEN RESULT SHOULD BE PASS OR ELSE FAIL
		if ((sub1Marks>=35 ) && (sub2Marks>=35) && (sub3Marks>=35))
		{
			finalResult="PASS"; //SET THE RESULT AS PASS 
		}
		else
		{
			finalResult="FAIL"; // SET THE RESULT AS FAIL
		}
		return finalResult;
	}
}
