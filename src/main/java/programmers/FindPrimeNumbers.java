package programmers;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		int n = 10;
		
		int answer = 0;
        
        boolean arr[] = new boolean[n+1];

        
		arr[0] = arr[1] = true;

		for (int i = 2; i * i <= n; i++) {

			if (!arr[i]) {
				for (int j = i * i; j <= n; j += i) {
					arr[j] = true;
                    
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (!arr[i]) {
				answer++;
			}
		}

		System.out.println(answer);
	}

}
