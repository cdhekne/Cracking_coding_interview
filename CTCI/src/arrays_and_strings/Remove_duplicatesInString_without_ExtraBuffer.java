package arrays_and_strings;

import java.util.Arrays;

public class Remove_duplicatesInString_without_ExtraBuffer {

	public String removeDuplicates(String input){

		char[] inpArr = input.toCharArray();

		Arrays.sort(inpArr);
		String inp = new String(inpArr);
		//System.out.println(inp);
		StringBuilder sb = new StringBuilder(inp);
		char temp = sb.charAt(0);

		for(int i=1; i<sb.length(); i++){

			if(temp == sb.charAt(i)){

				sb.deleteCharAt(i);
				i--;
			}
			else{

				temp = sb.charAt(i);
			}
		}


		return sb.toString();
	}

	public static void main(String[] args) {

		Remove_duplicatesInString_without_ExtraBuffer duplicatesInString_without_ExtraBuffer = new Remove_duplicatesInString_without_ExtraBuffer();
		System.out.println(duplicatesInString_without_ExtraBuffer.removeDuplicates("avaniuuuuasd"));
	}

}
