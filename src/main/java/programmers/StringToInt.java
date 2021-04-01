package programmers;

import java.util.Arrays;

public class StringToInt {

	public static void main(String[] args) {
		String str = "-12345";
		String str2 = "";



		int[] num = new int[str.length()];
		char[] change=new char[str.length()];
		for(int i = 0; i<change.length; i++){
		change[i]=str.charAt(i);
		}
		

		if(change[0]=='-'){
			for(int i = 1; i<change.length; i++){
				str2 += change[i];
				
			}
		}
		else if(change[0]=='+'){
			for(int i = 1; i<change.length; i++){
				str2 += change[i];
			
		}
		}
		else{
			for(int i = 0; i<change.length; i++){
				str2 += change[i];
				
		}
		}
		
		int num1 = Integer.parseInt(str2);
		System.out.println(num1);

	}

}
