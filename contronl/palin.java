package contronl;
import java.util.Scanner;
public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t,sum;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        n= sc.nextInt();
         
        t=n;
        sum =0;
        while(t>0)
        {
            sum = (sum*10) + (t%10);
            t/=10;
        }
         
        if(n==sum)
            System.out.println(n + " is a Palindrome Number.");
        else
            System.out.println(n + " is not a Palindrome Number.");

	}

}
