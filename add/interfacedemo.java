package add;

interface i1 {
	double pi=3.15;
	void methI1();
}
interface i2 extends i1 {
	void methI2();
}
class mybase {
	void mybasemeth()
	{
		System.out.println("call to mybasemeth");
	}	}
