package contronl;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		 int n, i, count=0;
	        Scanner s = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        n = s.nextInt();
			
	        for(i=2; i<n; i++)
	        {
	            if(n%i == 0)
	            {
	                count++;
	                break;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }

	}

}
