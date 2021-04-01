package programmers;

import java.util.Arrays;

public class SumIndex {

	public static void main(String[] args) {
		/*
		 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
			예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
			
			제한사항
			N의 범위 : 100,000,000 이하의 자연수
		 */
		int n = 123;
		int answer = 0;
		String num = Integer.toString(n);
		int[] num1 = new int[num.length()];
		for(int i=0;i<num.length();i++){
			num1[i] = n%10;
			n /=10;
		}
		
		for(int i = 0;i<num1.length; i++){
			answer += num1[i];
		}
		
		System.out.println(answer);
		
		
		
		
	}

}
