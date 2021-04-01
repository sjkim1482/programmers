package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeTest {

	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		
		int[] num1 = new int[answers.length];
		int[] num2 = new int[answers.length];
		int[] num3 = new int[answers.length];
		int count = 0;
		for(int i = 0; i<answers.length; i++){
			count++;
			num1[i] = count;
			
			if(count==5){
				count=0;
			}
		}
		count = 0;
		for(int i = 0; i<answers.length; i++){
			
			if (i % 2 == 0) {
				num2[i] = 2;
			} else {
				count++;
				if (count == 2) {
					count++;
				}
				
				num2[i] = count;
				if (count == 5) {
					count = 0;
				}
			}
		}
		count=3;
		for (int i = 0; i < answers.length; i++) {
			if(i%2==0){
			num3[i]= count;
			}else{
				if(count==3){
					num3[i]= count;
					count = 1;
				}else if(count==2){
					num3[i]= count;
					count = 4;
				}else{
					num3[i]= count;
					count++;
					if(count==6){
						count =3;
					}
				}
			}
		}
		
		for(int i = 0; i<answers.length; i++){
			if(answers[i]==num1[i]){
				num1[i]=0;
			}
			if(answers[i]==num2[i]){
				num2[i]=0;
			}
			if(answers[i]==num3[i]){
				num3[i]=0;
			}
			
		}
		
		int count1=0, count2=0,count3=0;
		for(int i=0; i<answers.length; i++){
			if(num1[i]==0){
				count1++;
			}
			if(num2[i]==0){
				count2++;
			}
			if(num3[i]==0){
				count3++;
			}
		}
		int[] temp;
		if(count1>count2 && count1>count3){
			temp = new int[]{1};
		}else if(count2>count1 && count2>count3){
			temp = new int[]{2};
		}else if(count3>count1 && count3>count2){
			temp = new int[]{3};
		}else if(count1==count2 && count1>count3){
			temp = new int[]{1,2};
		}else if(count1==count3 && count1>count2){
			temp = new int[]{1,3};
		}else if(count2==count3 && count2>count1){
			temp = new int[]{2,3};
		}else{
			temp = new int[]{1,2,3};
		}
		
		int[] answer = new int[temp.length];
		for(int i = 0 ; i<answer.length; i++){
			answer[i] = temp[i];
		}
		
        System.out.println(Arrays.toString(answer));
     
		
	}

}
