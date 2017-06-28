package codecheck;

public class App {
	public static void main(String[] args) {
		 if (args.length < 1) {   
			 System.out.println("Usage: java Postfix [infix expression]\n");
		      return;
		     
		    }
		else if(args.)
		    String infixExp = args[0];
			Calc c = new Calc();
	
			
		    String postfixExp = c.postfix(infixExp);
		    Double result = c.result(postfixExp);
		    /* System.out.println("The postfix expression for "+ infixExp +" is " + postfixExp);*/
		    System.out.printf(postfixExp +" = "+"%.0f",result);
		  }
		}
