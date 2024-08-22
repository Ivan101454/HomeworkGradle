package ru.clevertec.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import ru.clevertec.InputException;

import java.util.List;

class StringUtilsTest {

    @Test
    void isPositiveNumber() throws InputException {
        boolean positiveNumber = false;
        positiveNumber = StringUtils.isPositiveNumber("1.5");
        assertThat(positiveNumber).isEqualTo(true);
    }

    @Test
    void isNegativeNumber() throws InputException {
        assertThat(StringUtils.isPositiveNumber("-10")).isEqualTo(false);
    }


    @Test
    void testIsResolverDataRecogniseInput() throws InputException {
        List<String> strings = null;
        strings = StringUtils.resolverInputData("-123");
        String first = strings.getFirst();
        assertThat(first).isEqualTo("-123");
    }

    @Test
    void throwExceptionIfUserDontEnterNumber() {
        try {
            StringUtils.resolverInputData("qwe");
            fail("There should be exception");
        } catch (Exception ex) {
            assertThat(true).isTrue();
        }
    }

    @Test
    void throwExceptionIfEnterTwoNumber() {
        try {
            StringUtils.isPositiveNumber("123, 568");
            fail("Enter more than one number");
        } catch (Exception ex) {
            assertThat(true).isTrue();
        }
    }
}