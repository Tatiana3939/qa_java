package com.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest extends TestCase {
    @Test
    public void isEatLikePredatorTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы","Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
    @Test
    public void isFamilyGetTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
    @Test
    public void isGetKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
}