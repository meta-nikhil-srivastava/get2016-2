package session1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
	private Digits[] digit;
	private Operator[] operator;
	private Layout layout;
	private Display display;
	
	//do nothing constructor
	public Calculator()
	{
		
	}
	
	//initialize all the objects
	public Calculator(int digit, char operator, int digits) 
	{
		
	}

	//logic for action when the buttons are clicked
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	//sending the reference for
	public Digits[] getDigits() 
	{
		return digit;
	}
}
