package arrays_and_strings;

import java.util.*;
import java.util.HashMap;

public class Are_Two_Strings_Anagrams {

	public boolean areStringsAnagrams(String ip1,String ip2){

		/*char [] char1Array = ip1.toCharArray();
		char [] char2Array = ip2.toCharArray();

		HashMap<Character, Integer> String1HashMap = new HashMap<Character,Integer>();
		HashMap<Character, Integer> String2HashMap = new HashMap<Character,Integer>();
		if(!(ip1.length()==ip2.length())){
			return false;
		}
		else{
			for(int i=0;i<ip1.length();i++){
				if(String1HashMap.isEmpty() && String2HashMap.isEmpty()){
					String1HashMap.put(char1Array[i], 1);
					String2HashMap.put(char2Array[i], 1);
				}

			}
		}
		 */
		if(ip1.length()!=ip2.length())
			return false;
		else{
			char [] charIp1 = ip1.toCharArray(); 
			char [] charIp2 = ip2.toCharArray();
			Arrays.sort(charIp1);
			Arrays.sort(charIp2);
			if(Arrays.equals(charIp1, charIp2))
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {

		Are_Two_Strings_Anagrams areAnagram = new Are_Two_Strings_Anagrams();
		System.out.println(areAnagram.areStringsAnagrams("chinmay", "ymanhic"));
	}

}