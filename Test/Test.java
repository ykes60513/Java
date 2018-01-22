import java.io.*;
import java.util.*;

public class Test{
	public static void main(String[] args){
		//println(getUserInput("1"));
		String asd = "123";

		System.out.print(asd + "  TEST ");
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		asd = is.readLine();
		System.out.print(asd + "   NTU ");
		}catch(IOException e){
			System.out.println("ERROR : " + e);
		}

	}



}
/*
public String getUserInput(String prompt) {
	String inputLine = null;
	System.out.println(prompt + "  ");
	try {
		BufferedReader is = new BufferedReader(
				new InputStreamReader(System.in));
		inputLine = is.readLine();
		if (inputLine.length() == 0 )  return null; 
	} catch (IOException e) {
		System.out.println("IOException: " + e);
	}
	return inputLine.toLowerCase();
}
*/
