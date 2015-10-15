package arrays_and_strings;

import java.util.HashMap;

public class Remove_duplicatesInString_without_ExtraBuffer {

	public String removeDuplicates(String input){
		
		String distinctString = "";
		HashMap<Character, Boolean> characters = new HashMap<Character,Boolean>();
		char[] charArr = input.toCharArray();
		int iterator = 0;
		while(iterator<input.length()){
			if(characters.isEmpty()){
				characters.put(charArr[iterator], true);
			distinctString+=charArr[iterator++];
			}
			else if(characters.containsKey(charArr[iterator])){
				iterator++;
			}
			else{
				characters.put(charArr[iterator], true);
				distinctString+=charArr[iterator++];
			}
		}
		
		return distinctString;
	}
	
	public static void main(String[] args) {
		
		Remove_duplicatesInString_without_ExtraBuffer duplicatesInString_without_ExtraBuffer = new Remove_duplicatesInString_without_ExtraBuffer();
		System.out.println(duplicatesInString_without_ExtraBuffer.removeDuplicates("chinmmmmay"));
	}

}
