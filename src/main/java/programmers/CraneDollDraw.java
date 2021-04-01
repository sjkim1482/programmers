package programmers;

public class CraneDollDraw {
    
    public static void main(String[] args) {
    	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] moves = {1,5,3,5,1,2,1,4};
    	int answer = 0;

        int[] result = new int[board.length*board[0].length];
    	int count = 0;
    	for(int i = 0; i<moves.length; i++) {
    		for(int j = 0; j<board.length; j++) {
    			if(board[j][moves[i]-1]!=0) {
    				result[count] = board[j][moves[i]-1];
    				board[j][moves[i]-1] = 0;
    				if(count!=0&&result[count-1]==result[count]) {
    					answer+=2;
    					result[count-1] = 0;
    					result[count] = 0;
    					count--;
    					break;
    					
    				}else {
    					count++;
    					break;
    				}
    			}
    		}
    	}

    	System.out.println(answer);
	}
}
