package programmers;

public class CaesarPassword {

	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		String answer = "";
        
        char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if ((char) s.charAt(i) != 32) {
				if ((char) s.charAt(i)+n > 'z'&&(char) s.charAt(i)>='a'&&(char) s.charAt(i)<='z' ||
						(char) s.charAt(i)+n > 'Z'&&(char) s.charAt(i)>='A'&&(char) s.charAt(i)<='Z') {
					arr[i] = (char) (s.charAt(i) - 26 + n);
					answer += arr[i];
				} else {
					arr[i] = (char) (s.charAt(i) + n);
					answer += arr[i];
				}

			} else {
				arr[i] = (char) (s.charAt(i));
				answer += arr[i];
			}

		}
        
        System.out.println(answer);
	}

}
