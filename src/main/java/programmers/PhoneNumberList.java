package com.nsetec;

import java.util.Arrays;

public class PhoneNumberList {

	public static void main(String[] args) {
		
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"123","456","789"};
		String[] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
        Arrays.sort(phone_book); 
        int length = phone_book.length-1;
        for(int i = 0; i < length; i++) {
       
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
				break;
			}
			
		}
		
		System.out.println(answer);
		
	}

}
