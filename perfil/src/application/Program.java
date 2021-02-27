package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Data de nascimento: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        System.out.printf("%d/%d/%d\n",d,m,a);

        int x = d*100+m+a;

        switch((x/100 + x%100)%5){
            case 0:
                System.out.print("tímido"); break;
            case 1:
                System.out.print("sonhador"); break;
            case 2:
                System.out.print("paquerador"); break;
            case 3:
                System.out.print("atraente"); break;
            case 4:
                System.out.print("irresistível"); break;
        }
    }
}
