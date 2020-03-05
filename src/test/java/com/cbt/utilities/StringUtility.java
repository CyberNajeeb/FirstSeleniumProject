package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String a, String b){
        if (a.equalsIgnoreCase(b)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println(a);
            System.out.println(b);
        }
        return "";
    }

}
