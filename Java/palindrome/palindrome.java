package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class problem5 {

	
	public static void main(String[] args) {
		
		problem1 P = new problem1();
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		List<String> strList = new ArrayList<String>();	
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			String tmp = "";

			for(int j = str.length()-1; j > -1; j--) {
				tmp += str.charAt(j);
			}
			strList.add(tmp);
			
		}

		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i)); 
		}
		
			
		
	}
}
