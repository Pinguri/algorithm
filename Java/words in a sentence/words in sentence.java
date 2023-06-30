package algorithm;

import java.util.Arrays;
import java.util.Scanner;

class problem {

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
		
		problem P = new problem();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		
		String answer = P.solution(str);
	}
}
