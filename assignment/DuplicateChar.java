package com.assignment;

public class DuplicateChar {
	public static void main(String[] args) {
		String a = "Deepak";
		String[] splitArr = a.toLowerCase().split("");
		String[] str = new String[a.length()];
		int count = 0;
		for (String b : splitArr) {
			str[count] = b;
			int charCount = 0;
			for(int i = 0; i < splitArr.length; i++) {
				
				if(b == splitArr[i]) {
					++charCount;
				}
				if(charCount > 1) {
					System.out.println(b +" is repeated "+charCount+" times");
				}
				
			}
			count++;
		}
	}
}
