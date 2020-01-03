package com.strings;

public class JadenCasingString {

    public String toJadenCase(String phrase){

        String []  words = phrase.split("\\W+");
        StringBuilder sb = null;

        for (int i = 0; i < words.length; i++) {
            String a = words[i].replace(words[i].charAt(0),Character.toUpperCase(words[i].charAt(0)));

        }

        return sb.toString();
    }
}
