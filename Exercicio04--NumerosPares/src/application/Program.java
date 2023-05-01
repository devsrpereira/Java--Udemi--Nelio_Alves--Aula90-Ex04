package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        String txtPares = "";
        int pares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i]%2 == 0){
                txtPares += String.format("%d  ",vect[i]);
                pares ++;
            }
        }

        System.out.printf("%nNUMEROS PARES:%n%s",txtPares);

        System.out.printf("%n%nQUANTIDADE DE PARES = %d%n",pares);

        sc.close();
    }
}
