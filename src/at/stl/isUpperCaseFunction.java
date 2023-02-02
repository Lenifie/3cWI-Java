package at.stl;

import java.util.Scanner;

public class isUpperCaseFunction {
    public static void main(String args[]) {

        String t = "ABCdefgHiJKlmnoPqRStuvwXYz";
        String out1 = "";
        String out2 = "";

        for(char arr: t.toCharArray()){
            if(Character.isUpperCase(arr)){
                out1 += arr;

            }
            else{
                out2 += arr;

            }
        }
        System.out.println(out1);
        System.out.println(out2);
    }
}
