package Session3;

import java.util.Scanner;

public class GreatestCommonDivisor {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a,b;
			System.out.print("Enter two no");
			a=sc.nextInt();
			b=sc.nextInt();
			GreatestCommonDivisor obj=new GreatestCommonDivisor();
			a=obj.findGCD(a,b);
			System.out.print("gcd="+a);
			sc.close();
	}
		
		
		//method to find GCD
		public int findGCD(int x,int y)
		{
			//if remainder is 0 return value of y as GCD
			//base method till remainder i.e x become 0
			if(x==0)
			{
				return y;
			}
			
			//if x<y than x(i.e remainder) is mod of x ,y
			if(x<y)
			{
				return findGCD(y%x, x);
			}
			
			//else x(i.e Remainder) is mod of y,x
			else
			{
				return findGCD(x%y,y);
			}
		}
}