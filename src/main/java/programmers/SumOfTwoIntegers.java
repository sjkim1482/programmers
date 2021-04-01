package programmers;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		int a = 10; 
		int b = 1;
		long answer = 0;
        
        if(a>b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i<=b; i++){
			answer += i;
		}
        
		System.out.println(answer);
		
	}

}
