package AssignmentExam;
class teacher{
	String teachername;
	String subject;
	double salary;
	
	public teacher(String teachername,String subject,double salary) {
		this.teachername=teachername;
		this.subject=subject;
		this.salary=salary;
		
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class ArrayTeacher {

	public static void main(String[] args) {
		teacher k1=new teacher("Alex","Java Fundamentals",1200L);
		teacher k2=new teacher("John","RDBMS",800L);
		teacher k3=new teacher("sam","Networking",900L);
		teacher k4=new teacher("Maria","Python",900L);
		teacher[] teacherlist= {k1,k2,k3,k3};
		for(teacher s:teacherlist) {
			System.out.println("Name: "+s.getTeachername()+",  Subject: "+s.getSubject()+",  Salary: "+s.getSalary());
		}

	}

}

