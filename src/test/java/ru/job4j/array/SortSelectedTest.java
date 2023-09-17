package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3() {
        int[] data = new int[] {12, 15, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 12, 15};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort10() {
        int[] data = new int[] {12, 15, 11, 3, 2, 5, 1, 9, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 5, 9, 9, 10, 11, 12, 15};
        assertThat(result).containsExactly(expected);
    }
}