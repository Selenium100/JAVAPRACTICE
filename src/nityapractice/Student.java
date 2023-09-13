package nityapractice;

public class Student {
	
	String sname;
	int rollno;
	String dept;
	String grade;
	
	public Student(String sname,int rollno,String dept,String grade) {
		this.sname=sname;
		this.rollno=rollno;
		this.dept=dept;
		this.grade=grade;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", dept=" + dept + ", grade=" + grade + "]";
	}
	
	

}
