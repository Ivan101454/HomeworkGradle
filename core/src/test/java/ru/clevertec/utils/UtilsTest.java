package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        boolean positiveNumber = false;
        positiveNumber = Utils.isAllPositiveNumbers("1.5", "3", "5");
        assertThat(positiveNumber).isEqualTo(true);
    }
}