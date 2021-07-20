package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {
    @Test
    public void when1ThenMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Monday";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when7ThenSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Sunday";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11ThenMonday() {
        int day = 11;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Error";
        Assert.assertEquals(expected, result);
    }
}