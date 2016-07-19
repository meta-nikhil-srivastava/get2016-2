package Session3;

import java.util.Scanner;
public class Remainder {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter two no");
		a=sc.nextInt();
		b=sc.nextInt();
		Remainder obj=new Remainder();
		a=obj.rem(a,b);
		sc.close();

	}
	
	
	//method to find remainder of number using subtraction technique
	public int rem(int a,int b)
	{
			if(a<b)    	//if a is less than b than return value of a
			{
				return a;
			}
			else		//else call function recursively with a=a-b and b
			{
				return rem(a-b,b);
			}
	}

}
