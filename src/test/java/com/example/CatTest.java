package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    @Mock
    Feline feline;
    @Test
    public void isSoundMiyTest() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals("Мяу", actual);

    }
    @Test
    public void isGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}