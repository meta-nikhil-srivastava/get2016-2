package Assignment1;

import java.util.Scanner;
import java.lang.Math;
//class to convert binary to octal number
public class BinaryToOctal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int no;
		System.out.print("Enter the binary no");
		no=sc.nextInt();
		BinaryToOctal obj=new BinaryToOctal();
		obj.convertBinaryToOctal(no);
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
			threedigits=n%1000;
			while(threedigits>0)
			{
				unitdigit=threedigits%10;
			    octalunit+=unitdigit*(Math.pow(2,count));
			    count++;
			    threedigits=threedigits/10;
			}
			octal =(int) (octal + octalunit*(Math.pow(10,noOftriplets)));
			noOftriplets++;
			n=n/1000;
			count=0;
			octalunit=0;
		} 
		System.out.print(octal);
		return octal;
		
	}

}

