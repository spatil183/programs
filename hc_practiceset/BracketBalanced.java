package hc_practiceset;

import java.util.Stack;

public class BracketBalanced {

	public static void main(String[] args) {
		
		String str = "([{}])";
		if(printBracketBalanced(str)) {
			System.out.println("String are balanced");
		}else
			System.out.println("String are not balanced");
	}
	
	static boolean printBracketBalanced(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			
			if(x=='('||x=='['||x=='{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(x) {
			case ')': check = stack.pop();
			if(check=='{'||check=='[')
				return false;
			break;
			
			case ']': check = stack.pop();
			if(check=='{'||check=='(')
				return false;
			break;
			
			case '}': check = stack.pop();
			if(check=='('||check=='[')
				return false;
			break;
			}
		}
		return (stack.isEmpty());
	}
}
