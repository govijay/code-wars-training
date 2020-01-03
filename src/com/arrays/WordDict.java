package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class WordDict {

    public static void main(String[] args) {
        String s ="Dug";
        int L = s.length();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < L; i++) {

            String newWord = s.substring(0,i)+"*"+s.substring(i+1,L);
            list.add(newWord);
        }


        System.out.println(Arrays.toString(list.toArray()));
    }
}
