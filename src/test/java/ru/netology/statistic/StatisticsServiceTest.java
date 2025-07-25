package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenMaxInMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 8, 12, 6, 3};
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenFirstIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 10, 5, 8};
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenNegative() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -1, -5, -3};
        long expected = -1;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}