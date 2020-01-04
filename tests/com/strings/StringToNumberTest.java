package com.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToNumberTest {

    @Test
    public void test1(){
        assertEquals("StringToNumber(1234)",1234,StringToNumber.stringToNumber("1234"));
    }

    @Test
    public void test2(){
        assertEquals("StringToNumber(-7)",-7,StringToNumber.stringToNumber("-7"));
    }

    @Test
    public void test3(){
        assertEquals("stringToNumber(1405)", 1405 , StringToNumber.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals("stringToNumber(-7)", -7 , StringToNumber.stringToNumber("-7"));
    }
}