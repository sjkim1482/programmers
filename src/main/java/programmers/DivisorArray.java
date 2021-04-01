package programmers;

import java.util.Arrays;


public class DivisorArray {

	public static void main(String[] args) {
		
		int[] arr = {2,36,1,3};
		int divisor = 1;
		int count = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%divisor==0){
				count++;
			}
		}
		
		int[] answer;
		if(count==0){
			answer = new int[]{-1};
		}else{
			answer = new int[count];
		count =0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]%divisor==0){
				answer[count] = arr[i];
				count++;
			}
		}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
