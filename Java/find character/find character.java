package algorithm;

import java.util.Scanner;

class problem {

	public int solution(String str, char t) {
		int answer=0;
		
		for(char a : str.toCharArray()) {
			if(a == t || a == Character.toUpperCase(t)) {
				answer++;
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		problem P = new problem();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		int answer = P.solution(str, c);
		System.out.println(answer);
	}
}
