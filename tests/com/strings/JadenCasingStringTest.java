package com.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JadenCasingStringTest {

    JadenCasingString js = new JadenCasingString();

    @Test
    public void testString(){
       // assertEquals("I'm Crying",js.toJadenCase("I'm crying"));
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", js.toJadenCase("most trees are blue"));
    }

}