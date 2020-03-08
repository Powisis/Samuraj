package Lab2;

import java.util.Random;

public class BinaryNumber {

    private int[] numbers;
    private double exponent;
    private double sign; //false -> -, true -> +

    public BinaryNumber(int[] _numbers) {
        numbers = wyodrebnionySurowyNumer(_numbers);
        exponent = wyodrebnionyWykladnik(_numbers);
        sign = wyodrebionyZnak(_numbers);
    }

    public BinaryNumber(double min, double max, int liczbaMiejscPoPrzecinku) {
        /**Creating random binary number based on recieved parms*/
        while (true) {
            var arr = randomowaTablicaBinarna(new int[potrzebneBity((int) min, (int) max, liczbaMiejscPoPrzecinku) + 1]); // +1 becaouse of bit of sign

            //Extendig array with exponent
            arr = rozszerzonaTablica(arr, exponentArrFromFloatingPoints(liczbaMiejscPoPrzecinku));

            var randomized = binaryNumberIntArrToDouble(arr);

            if (randomized >= min && randomized <= max) {

                if (!dlugoscPozycjiZmiennoprzecinkowych(randomized, liczbaMiejscPoPrzecinku))
                    continue;

                numbers = wyodrebnionySurowyNumer(arr);
                exponent = wyodrebnionyWykladnik(arr);
                sign = wyodrebionyZnak(arr);
                break;
            }
        }
    }

    public double getDouble() {
        return tablicaLiczbBinarnychToDouble();
    }

    public int[] getBinary() {
        int[] arr = rozszerzonaTablica(signArrFromSignNumber(sign), numbers);
        return rozszerzonaTablica(arr, exponentArrFromExponentNumber(exponent));
    }

    @Override
    public String toString() {
        return tablicaLiczbBinarnychToDouble() + "";
    }

    private int[] randomowaTablicaBinarna(int[] binary) {
        for (int i = 0; i < binary.length; i++)
            binary[i] = randomBinaryDigit();

        return binary;
    }

    private double tablicaLiczbBinarnychToDouble() {
        return tablicaLiczbBinarnychToDouble(sign, rawBinToDouble(numbers), exponent);
    }

    private double binaryNumberIntArrToDouble(int[] binaryNumberFormat) {
        double exp = wyodrebnionyWykladnik(binaryNumberFormat);
        double raw = wyodrebnionyNumer(binaryNumberFormat);
        double sgn = wyodrebionyZnak(binaryNumberFormat);

        return sgn * (raw * Math.pow(10.00, exp));
    }

    private double tablicaLiczbBinarnychToDouble(double _sign, double _raw, double _exp) {
        return _sign * (_raw * Math.pow(10.00, _exp));
    }

    private double wyodrebnionyNumer(int[] arr) {
        return rawBinToDouble(wyodrebnionySurowyNumer(arr));
    }

    private int[] wyodrebnionySurowyNumer(int[] arr) {
        int[] raw = new int[arr.length - 5];
        for (int i = 1; i < arr.length - 4; i++)
            raw[i - 1] = arr[i];

        return  raw;
    }

    private double wyodrebnionyWykladnik(int[] tab) {
        int[] wykladnikBinarny = new int[4];
        int cache = 0;
        for (int i = tab.length - 4; i < tab.length; i++)
            wykladnikBinarny[cache++] = tab[i];

        return  -1.00 * rawBinToDouble(wykladnikBinarny);
    }

    private boolean dlugoscPozycjiZmiennoprzecinkowych(double number, int floats) {
        String str = number + "";
        String[] strArr = str.split("\\.");
        if (strArr[1].length() > floats)
            return false;

        return true;
    }

    private double wyodrebionyZnak(int[] arr) {
        if (arr[0] == 1)
            return -1.00;

        return 1.00;
    }

    private int[] rozszerzonaTablica(int[] a, int[] b) {
        int[] tab = new int[a.length + b.length];

        //Pierwsza tablica
        for (int i = 0; i < a.length; i++)
            tab[i] = a[i];

        //Druga Tablica
        for (int i = 0; i < b.length; i++)
            tab[a.length + i] = b[i];

        return tab;
    }

    private int[] exponentArrFromFloatingPoints(int liczbaMiejscPoPrzecinku) {
        int[] wykladnikBinarnie = convertToRawBin(Math.abs(liczbaMiejscPoPrzecinku));
        if (wykladnikBinarnie.length < 4)
            wykladnikBinarnie = rozszerzonaTablica(new int[4 - wykladnikBinarnie.length], wykladnikBinarnie);

        return wykladnikBinarnie;
    }

    private int[] exponentArrFromExponentNumber(double exp) {
        return convertToRawBin(Math.abs((int) exp));
    }

    private int[] signArrFromSignNumber(double sgn) {
        if (sgn == -1.00)
            return new int[] { 1 };

        return new int[] { 0 };
    }

    private int randomBinaryDigit() {
        Random random = new Random();
        if (random.nextBoolean())
            return 1;

        return 0;
    }

    private int biggestAbs(int a, int b) {
        if (Math.abs(a) > Math.abs(b))
            return Math.abs(a);

        return Math.abs(b);
    }

    private int potrzebneBity(int value) {
        return Log2RoundedUp(value);
    }

    private int potrzebneBity(int min, int max, int floatingPositions) {

        double neededRaw = (biggestAbs(min, max) * (int) Math.pow(10.00, (double) floatingPositions)) + biggestNumberWithSizeOf(floatingPositions);
        return Log2RoundedUp(neededRaw);
    }

    private int Log2RoundedUp(int n) {
        return Log2RoundedUp((double) n);
    }

    private int Log2RoundedUp(double n) {
        if (n <= 1.00)
            return 0;

        double log = (Math.log10(n) / Math.log10(2));

        return  (int) log + 1;
    }

    private double biggestNumberWithSizeOf(int size) {
        if (size == 0)
            return 0;

        String str = "";
        for (int i = 0; i < size; i++)
            str += "9";
        str += ".00";

        return Double.parseDouble(str);
    }

    private int[] reverseArr(int[] arr) {
        int[] reversed = new int[arr.length];
        int i = 0;
        for (int x = arr.length - 1; x >= 0; x--) {
            reversed[i++] = arr[x];
        }

        return reversed;
    }

    private int[] convertToRawBin(int n) {
        if (n == 0)
            return new int[] { 0 };

        int[] arr = new int[Log2RoundedUp(n)];
        int i = 0;
        while (n > 0) {
            arr[i++] = n % 2;
            n /= 2;
        }

        return reverseArr(arr);
    }

    private int rawBinToInt(int[] bin) {
        return (int) rawBinToDouble(bin);
    }

    private double rawBinToDouble(int[] bin) {
        if (bin.length == 0)
            return 0.00;

        double number = 0.00;
        int[] reversed = reverseArr(bin);
        for (int i = 0; i < bin.length; i++)
            number += bin[i] * Math.pow(2.00, (double) (bin.length - (i + 1)));

        return number;

    }
}

