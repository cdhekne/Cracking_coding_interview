package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

public class Unique_string_characters {

	
	public boolean isUnique(String input){
		
		Map<Character, Boolean> map = new HashMap<Character, Boolean>();
		char[] inputCharArray = input.toCharArray();

		for(char c:inputCharArray){
			if(!map.containsKey(c)){
				map.put(c, true);
			}
			else
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {

		Unique_string_characters string_characters = new Unique_string_characters();
		String input = "uma";
		boolean isTrue = false;
		isTrue = string_characters.isUnique(input);
		System.out.println(isTrue);
	}

}
