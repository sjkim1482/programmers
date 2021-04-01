package programmers;

public class SuBac {

	public static void main(String[] args) {
		int n = 4;
		String answer = "";
        for(int i = 1 ; i<=n; i++ ){
            if(i%2 == 1){
                answer += "수";
            }else{
                answer += "박";
            }
        
        }
        
        System.out.println(answer);
	}

}
