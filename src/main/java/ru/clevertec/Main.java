package by.ivan101454;



public class Main {
    public static void main(String[] args) {
        String s = args[0];
        boolean positiveNumber = StringUtils.isPositiveNumber(s);
        System.out.println(positiveNumber);
    }
}
