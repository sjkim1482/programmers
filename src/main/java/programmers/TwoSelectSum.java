package programmers;

import java.util.Arrays;


public class TwoSelectSum {

	public static void main(String[] args) {
		/*정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

		제한사항
		numbers의 길이는 2 이상 100 이하입니다.
		numbers의 모든 수는 0 이상 100 이하입니다.*/
		int[] a = {0,0,0,0,0,1,2,3,4,5,6};
		int length = 0;
		int count =0;
		
		for(int i = a.length-1; i>0 ; i--){
			length += i;
		}
		System.out.println(length);
		
		int[] sum = new int[length];
		
		for(int i = 0; i<a.length; i++){
			for(int j = i+1; j<a.length; j++){
				sum[count]= a[i]+a[j];
				count++;
			}
		}
		Arrays.sort(sum);
		int[] notOverlap = new int[sum.length];
		count = 0;
		
		for(int i = 0; i<notOverlap.length; i++){
			notOverlap[i] = -1;
		}
	
		for(int i = 0; i<sum.length; i++){
			boolean flag = false;
		
		
			for(int j = 0; j<notOverlap.length; j++){
				if(sum[i] == notOverlap[j]){
					flag = true;
					
				}
			}
			if(!flag){
				notOverlap[count] = sum[i];
				count++;
			}
		}
		
		int[] sort = new int[count];
		
		for (int i = 0; i < sort.length; i++) {
			sort[i] = notOverlap[i];
		}
	
		
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(notOverlap));
		System.out.println(Arrays.toString(sort));
		
	}
	
}
