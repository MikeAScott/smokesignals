package com.enkida.smokesignals;

public class LoggerHelper {
	
	public static String getClassName() {
		final Throwable throwable = new Throwable();
		throwable.fillInStackTrace();
		return (throwable.getStackTrace()[1].getClassName());
	}

}
