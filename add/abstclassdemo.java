package add;

public class abstclassdemo {

	public static void main(String[] args) {
	
				abstractshape s1=new circle();
				System.out.println("object if circle calling calcarea="+s1.calcarea());
				circle c=new circle();
				c.display();
				System.out.println("area of the circle="+c.calcarea());
				square s=new square();
				System.out.println("area of sqare="+s.calcarea());
		        s.display();

	}
	
}	
