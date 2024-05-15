package com.guna.testingpro;

public class Util {
	public static String parseNull(Object object) {
        return (object == null || object.toString().equals("")) ? "" : object.toString().trim();
	}

	public static String parseZero(Object object) {
	    return (object == null || object.toString().equals("")) ? "0" : object.toString().trim();
	}
}
