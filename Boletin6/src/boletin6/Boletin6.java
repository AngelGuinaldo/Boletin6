
package boletin6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @param
 * @author aguinaldogonzalez
 */

public class Boletin6 {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
       int num1,num2;
       String numero1=JOptionPane.showInputDialog("teclea numero1 : ");
        num1=Integer.parseInt(numero1);
        if(num1 >= 1){
            System.out.println(" e positivo");
        }
        else 
            System.out.print(" e negativo");
        
        
        
    }
    
}
