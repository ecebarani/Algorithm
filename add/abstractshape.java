package add;

abstract class abstractshape {
	protected int unit;
	abstract protected float calcarea();
	void display()
	{
		System.out.println("inside display method in the abs class");
	} }
class circle extends abstractshape {
	public circle() {
		unit=12;
	}
public float calcarea() {
	return (float)(3.14*unit*unit);
} }
class square extends abstractshape {
	public square() {
		unit=3;
	}
public float calcarea() {
	return(float)(unit*unit);
} 

}
