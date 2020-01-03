package com.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreTheySameTest {

    AreTheySame s = new AreTheySame();

    @Test
    public void areTheySameInt() {
        assertEquals(true,s.areTheySameInt(1,0));
    }
}