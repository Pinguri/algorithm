package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class problem {

	
	public static void main(String[] args) throws IOException {
		
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str =  br.readLine();
	String changeStr = str.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
	
	
	
	System.out.println(changeStr);
		
			
		
	}
}
