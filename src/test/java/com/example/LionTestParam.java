package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.rules.ExpectedException;
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
                {"Самка", false},
                {"Мужчина", false}
        };
    }

    @Test
    public void isLionMaleTest() {
        try {
        Lion lion = new Lion (sex, feline);
        boolean actual = lion.doesHaveMane();
        assertTrue(expected == actual);
        assertEquals(expected, lion.doesHaveMane());
        }
        catch (Exception exception){
            assertTrue(!sex.equals("Самец") && !sex.equals("Самка"));
            System.out.println("Произошла ошибка!");
        }
    }

    @Test(expected = AssertionError.class)
    public void exceptionLionSexTest() throws AssertionError {
        try {
            Lion lion = new Lion(" ", feline);
            Assert.fail("Expected AssertionError");
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
}