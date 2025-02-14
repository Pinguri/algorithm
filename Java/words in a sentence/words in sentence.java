package algorithm;

import java.util.Scanner;

class problem4 {

	public String solution(String str) {
		String answer ="";
	
		String [] arr = str.split("\\s");
		for(String a : arr){
			if(a.length() > answer.length()) {
				answer = a;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		problem1 P = new problem1();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		
		String answer = P.solution(str);
	}
}
