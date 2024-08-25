package ru.clevertec;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class MainTest {

    @Test
    void recognizeArgsParameter() {
        String[] mas = new String[]{"ewr", "123", "324"};
        String s = String.join("", mas);
        assertThat(s).isEqualTo("ewr123324");
        System.out.println(s);
    }
}