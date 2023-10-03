package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1Equals2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4() {
        int left = 1;
        int middleLeft = 2;
        int middleRight = 3;
        int right = 4;
        int result = Max.max(left, middleLeft, middleRight, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4Equals4And4And4() {
        int left = 4;
        int middleLeft = 4;
        int middleRight = 4;
        int right = 4;
        int result = Max.max(left, middleLeft, middleRight, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To3To2To1() {
        int left = 4;
        int middleLeft = 3;
        int middleRight = 2;
        int right = 1;
        int result = Max.max(left, middleLeft, middleRight, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}