
package boletin6_4;

import java.util.Scanner;





public class Persoa {
    String nombre1,nombre2;
    int peso1,peso2;
    public void lectura(){
        
        Scanner ler= new Scanner(System.in);
        System.out.println("Introduce primer nombre :");
        nombre1 = ler.nextLine();
        System.out.println("Introduce el peso de la primera persona :");
        peso1 = ler.nextInt();
        System.out.println("Introduce segundo nombre :");
        nombre2 = ler.nextLine();
        System.out.println("Introduce el peso de la segunda persona :");
        peso2 = ler.nextInt();
        
    }
    
    public void condicionales(){
        if(peso1 < peso2){
            System.out.println(nombre2 +"Pesa más");
        }
        else{
            System.out.println(nombre1 +"Pesa más");
        } 
        if(peso1==peso2)
            System.out.println(nombre1+" y "+nombre2+" pesan lo mismo");
        }
    public void resta(){
        if(peso1!=peso2){
           int resta=peso1-peso2;
           System.out.println("La diferencia de peso entre "+nombre1+" y "+nombre2+" es de "+resta);
        }
            
    }
    
    
}
