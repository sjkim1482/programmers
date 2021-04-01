package programmers;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class NoWanju {

	public static void main(String[] args) {
		/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		재한사항
		s는 길이가 1 이상, 100이하인 스트링입니다.
		*/
		

		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"marina", "josipa", "nikola", "filipa"};
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i = 0; i<completion.length; i++){
			if(!participant[i].equals(completion[i])){
				answer = participant[i];
				break;
			}
		}
		
		if(answer==""){
			answer = participant[participant.length-1];
		}
		System.out.println(answer);
		
		
		

	}

}
