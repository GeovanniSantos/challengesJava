package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c > a + b || a > b + c || b > a + c) {
            System.out.println("Os 3 lados nao formam um triangulo!");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isoceles");
        } else{
            System.out.println("Escaleno");
            {

            }
        }
    }
}