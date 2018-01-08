package add;

public class interfaceint extends mybase implements i2
{
            public double circle_circum(double r)
			{
				return(2*pi*r);
			}
			public void methI2() {
				System.out.println("call to methi2");
			}
			public void methI1() {
				System.out.println("call to methi1");
			}
			public static void main(String[] args) {
			interfaceint obj=new interfaceint();
			double ans=obj.circle_circum(4);
			System.out.println("circumference="+ans);
			obj.methI1();
			obj.methI2();
			obj.mybasemeth();


	}

}
