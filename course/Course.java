package course;

public class Course {
String courseid,coursename;
double price;
int duration;

public Course(String cid,String coursename,double price,int duration)
{
	courseid=cid;
	this.coursename=coursename;
	this.price=price;
	this.duration=duration;
}
public void displaycourse()
{
	System.out.println("courseid="+courseid);
	System.out.println("coursename="+coursename);
	System.out.println("price="+price);
	System.out.println("duration="+duration);
}
}
