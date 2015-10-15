package arrays_and_strings;

import java.util.Iterator;

public class ReplaceStringSpaces {

	public String replaceSpaces(String input){
		String finalString = "";
		
		String[]inpArray = input.split(" ");
		
		for (String string : inpArray) {
			finalString+=string+"%20";
		}
		finalString = finalString.substring(0,finalString.length()-3);	
		return finalString;
	}
	
	public static void main(String[] args) {
		ReplaceStringSpaces stringSpaces = new ReplaceStringSpaces();
		System.out.println(stringSpaces.replaceSpaces("chinmay is a grad student at ASU"));
	}

}
