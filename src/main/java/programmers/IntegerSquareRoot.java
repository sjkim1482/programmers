package programmers;

public class IntegerSquareRoot {

	public static void main(String[] args) {
//		임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//		제한 사항
//		n은 1이상, 50000000000000 이하인 양의 정수입니다
		long n = 3;
		long answer = 0;
		
		long sqrt = 0;
		
		sqrt = (long)Math.sqrt(n);
		
		
		if(n%sqrt ==0 && sqrt != 1){
			answer = sqrt+1;
			answer *= answer;
		}else if(n == 1){
			answer = 4;
		}else{
			answer = -1;
		}
        
        System.out.println(answer);
	}

}