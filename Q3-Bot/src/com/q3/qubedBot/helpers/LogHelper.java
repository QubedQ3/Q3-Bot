package com.q3.qubedBot.helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogHelper {
	private static String path = "./logs";

/**
 *
 * @param message
 * @throws IOException
 */
	public static void writeMessage(String message) throws IOException{

		File file = new File(path+"/"+getDate()+".txt");
		PrintWriter output;

		if (!file.exists()){
			file.getParentFile().mkdir();
			output = new PrintWriter(new FileWriter(file,true));
			output.printf("%s\r\n", message);
			output.close();
		}else {
			output = new PrintWriter(new FileWriter(file,true));
			output.printf("%s\r\n", message);
			output.close();
		}
	}
	/**
	 *
	 * @return fomatted date string "yyyy-MM-dd"
	 */
	public static String getDate(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = dateFormat.format(cal.getTime());

		return dateStr;
	}
}
