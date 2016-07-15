package Assignment1;

import java.util.Scanner;
import java.lang.Math;

//class to convert binary to octal number
public class BinaryToOctalConversion{
	
	
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int no;
		System.out.print("Enter the binary no");
		no=sc.nextInt();
		BinaryToOctalConversion obj=new BinaryToOctalConversion();
		int octal=obj.convertBinaryToOctal(no);

		System.out.print(octal);
		sc.close();
	}
	
	public int convertBinaryToOctal(int n)
	{
		int octalunit=0;    //conversion number of unit place into binary
		int octal=0;        //octal number
		int threedigits;    //last three digits of binary no
		int unitdigit;      //last digit of binary no
		int count=0;        //no of digits
		int noOftriplets=0; //no of triplets
		while(n>0)
		{
			threedigits=n%1000;		//to take last 3 digits of binary no
			while(threedigits>0)    //loop to covert last 3 binary number into octal number
			{
				unitdigit=threedigits%10;
			    octalunit+=unitdigit*(Math.pow(2,count)); //formula to convert the binary no to octal no
			    count++;
			    threedigits=threedigits/10;
			}
			octal =(int) (octal + octalunit*(Math.pow(10,noOftriplets))); //formula to append octal digits
			noOftriplets++;
			n=n/1000;
			count=0;
			octalunit=0;
		} 
		return octal;
		
	}


}
