package atividades;

import java.util.Scanner;

public class ActivityThree {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a temperatura em Fahrenheit:");
        int temp = entrada.nextInt();

        int c = (temp-32)*5/9;

        System.out.print("Temperatura em Celcius: "+c);
    }
}
