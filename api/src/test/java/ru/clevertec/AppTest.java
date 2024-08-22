package ru.clevertec;

import org.junit.jupiter.api.Test;
import ru.clevertec.utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;


class AppTest {

    @Test
    void isPositiveNumber() {
        assertThat(Utils.isAllPositiveNumbers("12", "79")).isTrue();
    }
}