package ru.clevertec.utils;

import ru.clevertec.InputException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isPositiveNumber(String str) throws InputException {
        List<String> input = null;
        try {
            input = resolverInputData(str);
        } catch (InputException e) {
            throw new RuntimeException(e);
        }
        boolean isPositive = false;
        if (input.size() == 1) {
            if (Double.parseDouble(input.getFirst()) > 0) {
                isPositive = true;
            } else isPositive = false;
        } else {
            throw new InputException("Можно ввести только одно число");
        }
        return isPositive;
    }

    public static List<String> resolverInputData(String str) throws InputException {
        final String regex = "-?\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> res = new ArrayList<>();
        while (matcher.find()) {
            res.add(matcher.group());
        }
        if (res.isEmpty()) {
            throw new InputException("вы не ввели число");
        }
        return res;
    }
}
