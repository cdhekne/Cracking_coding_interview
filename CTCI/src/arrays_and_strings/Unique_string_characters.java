package arrays_and_strings;

import java.util.HashMap;

public class Unique_string_characters {

	
	public boolean isUnique(String input){
		
		char [] charArray = input.toCharArray();
		HashMap<Character, Boolean> isUniqueMap = new HashMap<>();
		for(int i=0; i<input.length();i++){
			if(isUniqueMap.containsKey(charArray[i])==true){
				return false;
			}
			else
				isUniqueMap.put(charArray[i], true);
		}
		return true;
	}
	public static void main(String[] args) {

		Unique_string_characters string_characters = new Unique_string_characters();
		String input = "abccd";
		boolean isTrue = false;
		isTrue = string_characters.isUnique(input);
		System.out.println(isTrue);
	}

}
