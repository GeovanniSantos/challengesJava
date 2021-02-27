package util;

public class CurrencyConverter {
    public static double IOF = 6;

    public static double priceDollar(double dollar, double quantity){
    double value = dollar * quantity;
    return value = value * IOF / 100;
    }
}
