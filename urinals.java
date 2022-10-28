package testing;

/*
 * @author - Adit Virkar
 */

import java.io.*;

public class urinals {
	public static void main(String[] args) throws Exception {
		  BufferedReader fileData = urinalsFunctions.openFile();
	        String urinal = null;
	        while ((urinal = urinalsFunctions.countUrinals(fileData, urinal)) != null) {
	        	urinalsFunctions.getCount(urinal);    
	    }
	}
}