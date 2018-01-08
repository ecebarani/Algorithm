package add;

public class getset {
String empname;
String empid;
String empsalary;

	public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpid() {
	return empid;
}

public void setEmpid(String empid) {
	this.empid = empid;
}

public String getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(String empsalary) {
	this.empsalary = empsalary;
}

	public static void main(String[] args) {
		getset obj=new getset();
		obj.setEmpid("s1003");
		obj.setEmpname("barani");
		obj.setEmpsalary("87000");
		System.out.println("employee id:"+obj.getEmpid());
		System.out.println("employee name:"+obj.getEmpname());
		System.out.println("employee salary:"+obj.getEmpsalary());
	
	}

}
