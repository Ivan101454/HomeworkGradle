package ru.clevertec.utils;

import ru.clevertec.InputException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) throws InputException {
        List<Double> input = null;
        boolean isPositive = false;
        try {
            input = resolverInputData(str);
        } catch (InputException e) {
            throw new RuntimeException(e);
        }
//        input.size() == 1 ? StringUtils() : {

//        }
        List<Double> tempCollect = input.stream().filter(x -> x > 0).collect(Collectors.toList());
        if(input.size() == tempCollect.size()) {
            isPositive = true;
        }
        return isPositive;
    }

    public static List<Double> resolverInputData(String... str) throws InputException {
        final String regex = "-?\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        ArrayList<Double> res = new ArrayList<>();
        for (String input: str) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) res.add(Double.parseDouble(input));
        }
        if (res.isEmpty()) {
            throw new InputException("вы не ввели ни одного числа");
        }
        return res;
    }
}
