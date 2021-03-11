package com.shedrack.solution;

public class DecodeAtIndex {
	
	public static void main(String[] args) {
		String inputString = "ha22";
		decodeString(inputString, 5);
	}
	
	public static String decodeString(String inputString, int k) {
		
		long size = 0;
		int len = inputString.length();
		
		//Length of the decoded string - size
		// chakachakastocks3
		for(int i = 0; i < len; i++) {
			char ch = inputString.charAt(i);
				if(Character.isDigit(ch)) {
					size = size * Integer.parseInt("" + ch);
				}
				else {
					size++;
				}
		}
		for(int i = len - 1; i >= 0; i--) { 
			char ch = inputString.charAt(i);
			k%=size;
			if(Character.isLetter(ch) && k == 0) {
				System.out.println(Character.toString(ch));
				return Character.toString(ch);
				
			}
			if(Character.isDigit(ch))
				size = size/Integer.parseInt("" +ch);
			else
				size--;
			
		}
		return null;
	}

}
