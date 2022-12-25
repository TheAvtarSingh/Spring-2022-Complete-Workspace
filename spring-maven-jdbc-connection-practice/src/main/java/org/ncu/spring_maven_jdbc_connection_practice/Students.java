package org.ncu.spring_maven_jdbc_connection_practice;


//This class will get the data from input provided and set the fields and give it to DAO (Data Access Object) Interface
public class Students {
	
	
	
@Override
	public String toString() {
		return "Students [studentrno=" + studentrno + ", studentname=" + studentname + ", phonenumber=" + phonenumber
				+ ", studentaddress=" + studentaddress + ", modeoftransport=" + modeoftransport + "]";
	}

private int studentrno;
private String studentname;
private int phonenumber;
private String studentaddress;
private String modeoftransport;
public int getStudentrno() {
	return studentrno;
}
public void setStudentrno(int studentrno) {
	this.studentrno = studentrno;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress) {
	this.studentaddress = studentaddress;
}
public String getModeoftransport() {
	return modeoftransport;
}
public void setModeoftransport(String modeoftransport) {
	this.modeoftransport = modeoftransport;
}

}
