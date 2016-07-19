package Session3;

import java.util.Scanner;

public class LargestDigit {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a;
			System.out.print("Enter two no");
			a=sc.nextInt();
			LargestDigit obj=new LargestDigit();
			a=obj.findLargestDigit(a);
			System.out.print("Largest digit="+a);
			sc.close();
	}
		
		//method to find largest digit in given integer
		public int findLargestDigit(int n) 
		{
			int unitDigit=n%10; 	//unit digit of given number
			int tenDigit=(n/10)%10;	//tens digit of given number
			
			//base condition where n is less than ten
			if((n/10)<10)	
			{
				if(unitDigit>tenDigit) 	//compare the unit and ten digit of number
				{
					return unitDigit;	//if unit digit is greater return unit digit
				}
				else					//else return tens digit
				{
					return tenDigit;
				}
			}	//end of base condition
			
			//recursive condition
			else
			{
				if(unitDigit<tenDigit)     //if unit digit is less than ten digit 
				{
					n=n/10;				//number became n/10
					return findLargestDigit(n);		//call the recursive method
				}
				
			/**
			suppose n=1324
			than unitdigit=4
			and tendigit=2
			2<4
			therefore n=(1324/100)*10+(1324%10)
			that is: n=130+4=134
			*/
				else		//if unit digit is greater than ten digit
				{
					n=(n/100)*10+n%10;  //than ten digit will be drop and unit digit remain in its place
					return findLargestDigit(n);		//call the recursive method
				}
			}
		}

}
