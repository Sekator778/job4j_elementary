package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String day = "Monday";
        int result = 1;
        int expect = MultipleSwitchWeek.numberOfDay(day);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenWednesdayThen3() {
        String day = "Wednesday";
        int result = 3;
        int expect = MultipleSwitchWeek.numberOfDay(day);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenWrongdayThen1() {
        String day = "Wrongday";
        int result = -1;
        int expect = MultipleSwitchWeek.numberOfDay(day);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenSybotaThen6() {
        String day = "Суббота";
        int result = 6;
        int expect = MultipleSwitchWeek.numberOfDay(day);

        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenVtornikThen2() {
        String day = "Вторник";
        int result = 2;
        int expect = MultipleSwitchWeek.numberOfDay(day);

        Assert.assertEquals(expect, result);
    }
}