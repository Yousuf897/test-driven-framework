package com.companyname.utils;

public class StringUtil {

    public static String toUpperCase(String input) {
        if ( input == null ) throw new IllegalArgumentException("String value cannot be null.");
        return input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        if ( input == null ) throw new IllegalArgumentException("String value cannot be null.");
        return input.toLowerCase();
    }

}
