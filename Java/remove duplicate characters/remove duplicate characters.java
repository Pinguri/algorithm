package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class problem {

	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String input = buffer.readLine();
		
		String answer = "";
		String temp = "";
		
		for(int i = 0 ; i < input.length(); i++) {
			if(temp.indexOf(input.charAt(i)) < 0) {
				temp += input.charAt(i);
			}
			
		}
		
		System.out.println(temp);
		
	}
}
