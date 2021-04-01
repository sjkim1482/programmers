package programmers;

import java.util.Arrays;

public class MakeArray {

	public static void main(String[] args) {
		/*
		 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을
		 * 리턴합니다.
		 * 
		 * 제한 조건 n은 10,000,000,000이하인 자연수입니다.
		 */
		long n = 12345;
		String a = Long.toString(n);
		int[] answer = new int[a.length()];
		for(int i = 0; i<a.length(); i++){
			answer[i] = Integer.parseInt(a.substring(i, i+1));
		}
		
		for(int i = 0; i<answer.length/2; i++){
			int temp = answer[i];
			answer[i]=answer[answer.length-1-i];
			answer[answer.length-1-i] = temp;
		}
        System.out.println(Arrays.toString(answer));
	}

}
