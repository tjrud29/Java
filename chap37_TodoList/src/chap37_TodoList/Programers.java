package chap37_TodoList;

public class Programers {
	public static void main(String[] args)  {
		
int answer = 0;//answer = 피자 개수
        int n = 6;
        for(int i = 1; i <=n; i++ ) {
        if((6 * i) % n  == 0) {
            answer = i; 
        }
        System.out.println(answer);
    }
	    
	   }
}

