package programmers;

import java.util.Arrays;

public class DeleteMin {

	public static void main(String[] args) {
/*		정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 		예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

		제한 조건
		arr은 길이 1 이상인 배열입니다.
		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.*/
		int[] arr = {1,1,1,1,1,3,2,4,5,34,4,6,6,1,1,1};
		int min = arr[0];
		int count =-1;
		for(int i = 0;i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
			}else if(min == arr[i]){
				count++;
			}
		}
		System.out.println(min);

		
		int[] dm = new int[arr.length-count];
		count = 0;
		int count2 = 0;
		for(int i = 0;i<dm.length; i++){
			if(min==arr[i]){
				if(count==arr.length-1)
				{
					break;
				}else{
					for(int j = 0; j < arr.length; j++){
						if(min==arr[count+j]){
							count2++;
						}
					}
				dm[i]= arr[count2+1];
				count += 2;
				}
			}else{
				if(count>arr.length-1){
					break;
				}else{
				dm[i] = arr[count];
				count++;
			}
			}
		}
		System.out.println(Arrays.toString(dm));
		
		
		
	}

}
