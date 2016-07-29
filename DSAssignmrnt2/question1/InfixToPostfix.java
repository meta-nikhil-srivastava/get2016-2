package session2;

public class InfixToPostfix 
{
	MyStack<Character> stack;
	String input;
	String output;
	int size;
	 InfixToPostfix(String in) 
	{
		stack=new MyStack<Character>();
		input = "("+in+")";
		output="";
		size=input.length();
	}
	
	public String convertToPostfix()
	{
		for(int index=0;index<size;index++)
		{
			char ch=input.charAt(index);
			if(isAlpha(ch))
			{
				output+=ch;
			}
			
			else if(isOperator(ch))
			{
				if(ch=='(')
				{
					stack.push(ch);
				}
				
				else if(ch==')'&&stack.getTop()!=null)
				{
					char operator=stack.pop();
					stack.push(operator);
					while(stack.getTop()!=null&&operator!='(')
					{
						
						operator=stack.pop();
						if(operator!='(')
						output+=operator;
					}
				}
				
				else
				{
					if(stack.getTop()!=null)
					{
						char preOperator=stack.pop();
						stack.push(preOperator);
						if(precedence(ch)>precedence(preOperator))
						{
							stack.push(ch);
						}
						else
						{
							while(preOperator!='('||precedence(ch)<=precedence(preOperator))
							{
								Character v=stack.pop();
								if(v!='(')
								output+=v;
								preOperator=(char)stack.pop();
								stack.push(preOperator);
							}
							stack.push(ch);
						}
					}
				}
			}
		}
		return output;
	}
	
	public boolean isAlpha(char ch)
	{
		    if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		    {
		        return true;
		    }
		    else 
		        return false;
	}
	
	public boolean isOperator(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='('||ch==')')
	        return true;
	    else
	    	return false;
	}
	
	public int precedence(char ch)
	{
		if(ch=='-')
		{
			return 1;
		}
		else if(ch=='+')
		{
			return 2;
		}
		else if(ch=='*')
		{
			return 3;
		}
		else if(ch=='/')
		{
			return 4;
		}
		else if(ch=='^')
			return 5;
		else
		{
			return 0;
		}
	}
	
	public static void main(String args[])
	{
		InfixToPostfix li=new InfixToPostfix("a+b*c+d");
		String str=li.convertToPostfix();
		System.out.println(str);
	}
}
