
public class staticdemo {
static int var1;
int var2;
public staticdemo()
{
	var1++;
	var2++;
}
	public static void main(String[] args) {
	staticdemo obj1=new staticdemo();
	staticdemo obj2=new staticdemo();
	staticdemo obj3=new staticdemo();
System.out.println("static variable var1:"+obj3.var1);
System.out.println("instance variable var2:"+obj3.var2);

	}

}
