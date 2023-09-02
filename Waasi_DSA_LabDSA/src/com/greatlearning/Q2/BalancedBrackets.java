package com.greatlearning.Q2;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	 public static boolean isBalanced(String input) {
		 Stack<Character> stack = new Stack<>();
		 
		 for(int i=0; i<input.length() ; i++) {
			 
			 char bracket = input.charAt(i);
//			 System.out.println(bracket);
			 //add the open brackets in added
			 if(bracket == '{' || bracket == '[' || bracket == '(' ) {
				 stack.push(bracket);
				 continue;
			 } 
			 
			 //before going to close bracket checking whether stack is empty
			 if(stack.isEmpty()) return false;
			 
			 char openBracket;
			 switch(bracket) {
			   case '}' :
				   openBracket = stack.pop();
				   if (openBracket == ']' || openBracket == ')') return false;
				   break;
			   case ']' :
				   openBracket = stack.pop();
				   if(openBracket == ')' || openBracket == '}') return false;
				   break;
			   case ')' :
				   openBracket = stack.pop();
				   if(openBracket == ']' || openBracket == '}')  return false;
				   break;
		     }
				   
		 }  
		 return (stack.isEmpty()); 
} 


public static void main(String[] args) {
	// TODO Auto-generated method stub
	//[ {( ) }]
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
//	System.out.println(input);
	boolean ans =isBalanced(input);
	if(ans) {
		System.out.println("The entered String has Balanced Brackets");
	}
	else {
		System.out.println("The entered String do not contain Balanced Brackets");
	}
}

}


//public class BalancedBrackets {
//		 public static boolean isBalanced(String input) {
//		        int countParentheses = 0;
//		        int countSquareBrackets = 0;
//		        int countCurlyBrackets = 0;
//		        
//		        for (int i = 0; i < input.length(); i++) {
//		            char ch = input.charAt(i);
//
//		            if (ch == '(') {
//		                countParentheses++;
//		            } else if (ch == ')') {
//		                countParentheses--;
//		            } else if (ch == '[') {
//		                countSquareBrackets++;
//		            } else if (ch == ']') {
//		                countSquareBrackets--;
//		            } else if (ch == '{') {
//		                countCurlyBrackets++;
//		            } else if (ch == '}') {
//		                countCurlyBrackets--;
//		            }
//
//		            // Check if any of the counters are negative
//		            if ( countParentheses == 0 && countSquareBrackets == 0 && countCurlyBrackets == 0) {
//		                return true;
//		            }
//		        }
//		        
//		        return false;   
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//[ {( ) }]
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		System.out.println(input);
//		boolean ans =isBalanced(input);
//		System.out.println(ans);
//	}
//
//}
