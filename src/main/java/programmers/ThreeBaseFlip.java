package programmers;

public class ThreeBaseFlip {

	public static void main(String[] args) {

		int n = 125;
		int answer = 0;
	        
	    int a = 1;
		String add = "";
		while (n>0) {
			add += n%3;
			n /= 3;
		}
		
		for(int i = 0; i<add.length(); i++) {
			for(int j = 0; j<i;j++) {
				a *= 3;
			}
			answer += a*Integer.parseInt(add.substring(add.length()-i-1, add.length()-i));
			a=1;
	    }
	    
		System.out.println(answer);
	 
		
	}

}
