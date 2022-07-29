package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTestParam{

    private final String sex;
    private final boolean expected;

    Feline feline;

    public LionTestParam(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void isLionMaleTest() throws Exception {
        Lion lion = new Lion (sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
        assertEquals(expected, lion.doesHaveMane());
        System.out.println(actual);
    }
}