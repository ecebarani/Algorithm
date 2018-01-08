package add;

public class add {
  
	public int method(int num1,int num2)
	{
		return num1+num2;
	}
	
	public static void main(String[] args) {
			int a=10;
			add addition=new add();
			int result;
		    result = addition.method(102,104);
			System.out.println("enter the value:"+result);
			System.out.println("enter the variable:"+a);
	}

	}
