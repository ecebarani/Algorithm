package add;

public class boxoverloading {
double width,height,depth;
public boxoverloading() {
	width=10;
	height=15;
	depth=20;
}
public boxoverloading(double val) {
	width=height=depth=(val>0)?val:1;
	System.out.println(val);
}
public boxoverloading(double w,double h,double d) {
	width=(w>0)?w:1;
	depth=(w>0)?w:1;
	depth=(w>0)?w:1;
}
}
