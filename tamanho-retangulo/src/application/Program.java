package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle size = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        size.height = sc.nextDouble();
        size.width = sc.nextDouble();

        System.out.printf("AREA: %.2f\n" , size.Area());
        System.out.printf("PERIMETER: %.2f\n", size.Perimeter());
        System.out.printf("DIAGONAL: %.2f\n", size.Diagonal());
    }
}
