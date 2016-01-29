package arrays_and_strings;

import java.util.Stack;

public class Reverse_C_Style_String {

	public String reverseString(String input){
		
		Stack<Character> charStack = new Stack<Character>();
		for(char c :input.toCharArray()){
			charStack.push(c);
		}
		String op="";
		while(!charStack.isEmpty()){
			op+=charStack.pop();
		}
			
		return op;
	}
	
	public static void main(String[] args) {
		Reverse_C_Style_String reverse_C_Style_String = new Reverse_C_Style_String();
		String input = "abcd";
		System.out.println(reverse_C_Style_String.reverseString(input));

	}

}
