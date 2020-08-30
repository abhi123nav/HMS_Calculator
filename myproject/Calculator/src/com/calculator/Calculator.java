package com.calculator;
import java.util.Stack; 
public class Calculator {

	static int Prec(String ch) 
	{ 
		switch (ch) 
		{ 
		case "+": 
		case "-": 
			return 1; 
	
		case "*": 
		case "/": 
			return 2; 
	
		case "^": 
			return 3; 
		} 
		return -1; 
	} 
 public static boolean isdigit(String s1)
 {
	 if(s1.charAt(0)!='+'&& s1.charAt(0)!='-' && s1.charAt(0)!='*'&& s1.charAt(0)!='/' && s1.charAt(0)!=')'&& s1.charAt(0)!='(' && s1.charAt(0)!='^')
	 return true;
	 return false;
 }
	static String infixToPostfix(String exp) 
	{ exp=exp.trim();

		String result = new String(" "); 
		Stack<String> stack = new Stack<>(); 
		
		for (int i = 0; i<exp.length();i++ ) 
		{ 
			String s1=Character.toString(exp.charAt(i));
			 if(s1.charAt(0)=='+'|| s1.charAt(0)=='-' || s1.charAt(0)=='*'|| s1.charAt(0)=='/' || s1.charAt(0)==')'|| s1.charAt(0)=='(' || s1.charAt(0)=='^')
			 {s1=s1;}
			 else{
			i++;
		    while(i<exp.length()&&exp.charAt(i)!='+'&& exp.charAt(i)!='-' && exp.charAt(i)!='*'&& exp.charAt(i)!='/' && exp.charAt(i)!=')'&& exp.charAt(i)!='(' &&exp.charAt(i)!='^')
		   {s1=s1+exp.charAt(i);i++;}
			 i--;
			 }
			if (s1.length()>1 || isdigit(s1) ) 
			{	result += s1+" "; //System.out.println(result);
			//System.out.println(s1+" "+isdigit(s1));
			}
			
			else if (s1.equals("(") )
			{	stack.push(s1); 
			//System.out.println(result);
			}
			else if (s1.equals(")"))  
			{ 
				while (!stack.isEmpty() && (stack.peek()).equals("(" )==false) 
					result += stack.pop()+" "; 

				if (!stack.isEmpty() && (stack.peek()).equals("(" )==false) 
					return "Invalid Expression"; // invalid expression				 
				else
					stack.pop(); 
					
			} 
			
			else // an operator is encountered 
			{ 
				while (!stack.isEmpty() && Prec(s1) <= Prec(stack.peek())){ 
					if(stack.peek().equals("(") ) 
						return "Invalid Expression"; 
					result += stack.pop()+" "; 
			} 
				stack.push(s1); 
			} 
	//System.out.println(stack);
		} 
	
		// pop all the operators from the stack 
		while (!stack.isEmpty()){ 
			if(stack.peek().equals("(")) 
				return "Invalid Expression"; 
			result += stack.pop()+" "; 
		} 
		return result; 
	} 
	static String evaluatePostfix(String exp) 
	{ 
		 
		Stack<Double> stack=new Stack<>(); 
		exp=exp.trim();exp=exp+" ";
		for(int i=0;i<exp.length();i++) 
		{ String s1="";
			while(exp.charAt(i)!=32)
			{
				s1=s1+exp.charAt(i);i++;
			}
		//	System.out.println(s1);
			if(isdigit(s1))
			stack.push(Double.parseDouble(s1));
			else
			{ 
				double val1 = stack.pop(); 
				double val2 = stack.pop(); 
				
				switch(s1) 
				{ 
					case "+": 
					stack.push(val2+val1); 
					break; 
					
					case "-": 
					stack.push(val2- val1); 
					break; 
					
					case "/": 
					stack.push(val2/val1); 
					break; 
					
					case "*": 
					stack.push(val2*val1); 
					break; 
					case "^": 
					stack.push(Math.pow(val2,val1)); 
					break; 
			} 
			} 
		} 
		String s=String.valueOf(stack.pop());
		return s;	 
	} 
	
	//Note here "/" means division not "%"
	public static void main(String[] args) 
	{ 
		String exp = "1+2*(3+4-5)*(6+7*8)-9"; 
		String exp1="2.5/3";
		String exp2="a+b*(c^d-e)^(f+g*h)-i";
		
String postfix=infixToPostfix(exp1);

System.out.println("postfix "+postfix);
System.out.println("value "+evaluatePostfix(postfix));
System.out.println("Answer by java "+(1+2*(3+4-5)*(6+7*8)-9));

	} 
	
	
}
