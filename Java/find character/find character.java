package algorithm;

import java.util.Scanner;

class problem2 {


	
	public static void main(String[] args) {
		
		problem1 P = new problem1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);

		int answer=0;

		for(char a : str.toCharArray()) {
			if(a == c || a == Character.toUpperCase(c)) {
				answer++;
			}
		}



		System.out.println(answer);
	}
}
