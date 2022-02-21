package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsDemo2 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileReader fr= new FileReader("/Users/danielavazquez/eclipse-workspace/SeleniumTraining/src/day15/Text2.txt");
		try (BufferedReader bfr = new BufferedReader(fr)) {
			System.out.println(bfr.readLine());
		}	
		
		Thread.sleep(5000);
		
		
;	}

}
