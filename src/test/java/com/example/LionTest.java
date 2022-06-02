package com.example;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void isLionManTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertTrue(expected == actual);
    }
    @Test
    public void isLionHaveKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 0;
        int actual= lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void isLionPredatorTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}