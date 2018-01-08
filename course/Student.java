package course;

public class Student {
String studentid,studentname;
Course obj;
	
	public Student(String studentid,String studentname,String coursename,String courseid,double price,int duration)
	{
	this.studentid=studentid;
	this.studentname=studentname;
	obj=new Course(courseid,coursename,price,duration);
	}
	public void displaydetails()
	{
		System.out.println("studentid="+studentid);
		System.out.println("studentname="+studentname);
		obj.displaycourse();
	}
	
}
