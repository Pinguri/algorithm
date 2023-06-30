package algorithm;

import java.util.Scanner;

class problem {

	public String solution(String str) {
		String answer ="";
	
		for(char a : str.toCharArray()){
			a = ( a == Character.toUpperCase(a) ) ? Character.toLowerCase(a) : Character.toUpperCase(a);
			answer += a;
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		problem P = new problem();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		
		String answer = P.solution(str);
		System.out.println(answer);
	}
}
