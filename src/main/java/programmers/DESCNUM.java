package programmers;

import java.util.Arrays;

public class DESCNUM {

	public static void main(String[] args) {
		/*
		 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
			
			제한 조건
			n은 1이상 8000000000 이하인 자연수입니다. 
		 */
		
		long n = 118372;
		String a = Long.toString(n);
		int[] arr = new int[a.length()];
		int answer = 0;
		for(int i = 0; i<a.length(); i++){
			arr[i] = Integer.parseInt(a.substring(i, i+1));
		}
		
		Arrays.sort(arr);
		
		
		for(int i = arr.length-1; i>=0; i--){
			answer*=10;
			answer += arr[i];
		}
		
		System.out.println(answer);
	}

}
