package boletin6_6;

import java.util.Scanner;

public class Almacen {

    public void comp() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduce nombre del producto:");
        String producto = ler.nextLine();
        System.out.println("Introduce numero de ventas anuales:");
        int ventas = ler.nextInt();
        if (ventas <= 100) {
            System.out.println(producto + " es un articulo de bajo consumo");
        } else if (ventas <= 500) {
            System.out.println(producto + " es un articulo de consumo medio");
        } else if (ventas <= 1000) {
            System.out.println(producto + " es un articulo de alto consumo");
        } else if (ventas > 1000) {
            System.out.println(producto + " es una articulo de primera necesidad");
        }

    }

}
