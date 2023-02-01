package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 5700;
        int expected = 300;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountInCorrect() {
        int amount = 5000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}