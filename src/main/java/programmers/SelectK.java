package programmers;

import java.util.Arrays;

public class SelectK {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4}; 
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}} ;
		int count = 0;
		int[] answer = new int[commands.length];
		int[] temp; 
		for(int i = 0; i<answer.length; i++){
			count=0;
			temp = new int[commands[i][1]+1-commands[i][0]];
		for(int j = commands[i][0]-1; j < commands[i][1]; j++){
			temp[count] = array[j];
			count++;
		}

		Arrays.sort(temp);
		answer[i] = temp[commands[i][2]-1];
		
		
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		

	}

}
