package com.strings;

import java.util.ArrayList;
import java.util.List;

public class StringPartitioning {

    public static void findCombination(String str,int index,String output){


        // Base case
        if(index == str.length()){
            System.out.println(output);
        }

        for (int i = index; i < str.length(); i++) {
            // append substring formed str[index,i] to output string
            findCombination(str,i+1,output+ "(" + str.substring(index,i+1) + ")");
            
        }

    }

    public static void main(String[] args) {
        String str = "abcd";
        findCombination(str,0,"");
    }
}
