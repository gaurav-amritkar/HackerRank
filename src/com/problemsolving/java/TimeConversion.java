package com.problemsolving.java;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] strArr = s.split(":");
        
        if(strArr[2].substring(2).equals("PM")) {
            // PM
            if(strArr[0].equals("12")) {
                return strArr[0] + ":" + strArr[1] + ":" + strArr[2].substring(0,2);
            } else {
                int hour = Integer.parseInt(strArr[0]) + 12;
                return hour + ":" + strArr[1] + ":" + strArr[2].substring(0,2);
            }
        } else {
            // AM
            if(strArr[0].equals("12")) {
                return "00" + ":" + strArr[1] + ":" + strArr[2].substring(0,2);
            } else {
                return strArr[0] + ":" + strArr[1] + ":" + strArr[2].substring(0,2);
            }
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
