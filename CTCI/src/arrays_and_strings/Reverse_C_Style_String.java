package arrays_and_strings;

import java.util.Stack;

public class Reverse_C_Style_String {

	public String reverseString(String input){
		
		String reveresedString = "";
		char[] charArray = input.toCharArray();
		Stack<Character> stringStack = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			stringStack.push(charArray[i]);
		}
		while(!stringStack.isEmpty()){
			reveresedString+=stringStack.pop();
		}
		return reveresedString;
	}
	
	public static void main(String[] args) {
		Reverse_C_Style_String reverse_C_Style_String = new Reverse_C_Style_String();
		String input = "abcd";
		System.out.println(reverse_C_Style_String.reverseString(input));

	}

}
