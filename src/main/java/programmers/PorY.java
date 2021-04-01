package programmers;

public class PorY {

	public static void main(String[] args) {
		 boolean answer = true;
		 String s = "pPoooyY";
		 char[] c = new char[s.length()];

		 for(int i = 0; i<c.length; i++){
			 c[i] = s.charAt(i);
		 }
		 
		 int countp=0, county=0;
		 
		 
		 for(int i =0; i<c.length; i++){
			 if(c[i]=='p'||c[i]=='P'){
				 countp++;
			 }
			 if(c[i]=='y'||c[i]=='Y'){
				 county++;
			 }
			 
		 }
		 if(countp == county){
			 answer = true;
		 }else{
			 answer = false;
		 }
		 
	     System.out.println(answer);
	     
	}

}
