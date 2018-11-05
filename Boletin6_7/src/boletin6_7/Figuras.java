package boletin6_7;

import java.util.Scanner;

public class Figuras {

    public void Calcular() {
        System.out.println("Elige la figula\n 1--->Cuadrado\n 2--->Triangulo\n 3--->Circulo");
        double PI = 3.14;
        Scanner ler = new Scanner(System.in);
        int opcion = ler.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduce la medida del lado");
                int lado = ler.nextInt();
                System.out.println("El area de tu cuadrado es :" + lado*lado);
                break;
            case 2:
                System.out.println("Introduce Base");
                int base = ler.nextInt();
                System.out.println("Introduce Altura");
                int altura = ler.nextInt();
                System.out.println("El area de tu triangulo es:" + base * altura / 2);
                break;
            case 3:
                System.out.println("Introduce el radio");
                int radio = ler.nextInt();
                System.out.println("El area de tu circulo es" + PI * radio * radio);

        }

    }

}
