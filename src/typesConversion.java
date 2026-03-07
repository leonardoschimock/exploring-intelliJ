public class typesConversion {
    public static void main (String[] args) {
        int number = 10;
        double anotherNumber = number;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer integerNumber = 10;
        String numberString = integerNumber.toString();

        Double doubleNumber = 10.0;
        String doubleNumberString = doubleNumber.toString();

        Long longNumber = 10L;
        String longNumberString = longNumber.toString();

        String stringNumberTwo = "1234";
        Integer convertedNumber = Integer.parseInt(stringNumberTwo);
        Double convertedDoubleNumber = Double.parseDouble(stringNumberTwo);
        Long convertedLongNumber = Long.parseLong(stringNumberTwo);

        System.out.println (anotherNumber);
        System.out.println (int2);
        System.out.println (integerNumber + "  " + numberString);
        System.out.println (stringNumberTwo + "  " + convertedNumber);

    }
}
