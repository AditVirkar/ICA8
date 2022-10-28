package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class urinalsFunctions {
	public static String countUrinals(BufferedReader bufferedReader, String urinal) throws IOException {
		 urinal= bufferedReader.readLine();
		 return urinal;
	}
	public static void getCount(String urinals) {
		int count = 0;
		int correctNum = 0;
	  char[] num = new char[urinals.length()];
	  for (int i = 0; i < urinals.length(); i++) {
		num[i] = urinals.charAt(i);
	  }
		for(int i=0;i<num.length; i++){
		if(num[i] == '0'){
			if((i== 0 && num[i+1] != '1') || (i>0 && i<(num.length-1) && num[i-1] != '1' && num[i+1] != '1') || (i == (num.length - 1) && num[i-1] != '1')){
		        num[i] = '1';
		        count++;  
		    }
			}else {
				if ((num[i] == '1') && (i<(num.length-1) && num[i+1] == '1')){
					correctNum = 2;
				}
		}
	  }
		if(correctNum == 2) {
			System.out.println("-1");
	
		}else {
			System.out.println(count);
		}	
	}
	public static BufferedReader openFile() throws FileNotFoundException {
		File file = new File("C:/Users/Adit Virkar/Desktop/ICA8/urinal.dat");
	        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		return bufferedReader;
	}
	Boolean goodString( String str ) {
		System.out.println ("Not yet implemented"); 
		return true; 
		}
}