package ru.clevertec;


import ru.clevertec.utils.StringUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = String.join("", args);
        try {
            StringUtils.isPositiveNumber(s);
        } catch (InputException e) {
            e.printStackTrace();
        }
    }
}
