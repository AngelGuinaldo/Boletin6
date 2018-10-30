
package boletinseisdous;

import javax.swing.JOptionPane;


public class SumaResta {
      public void dousNumeros(){
       short num1,num2; 
        String numero1=JOptionPane.showInputDialog("teclea numero1 : ");
        num1=Short.parseShort(numero1);
        String numero2=JOptionPane.showInputDialog("Numero 2 :");
        num2 = Short.parseShort(numero2);
        if(num1 >= num2){
            System.out.println( "Resta :"+(num1-num2));
        }
        System.out.println("Suma :"+(num1+num2));
     
    }
}
