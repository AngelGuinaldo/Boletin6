package boletin6_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MasMenos {

    public void masMenos() {
        Scanner ler = new Scanner(System.in);
        int numero;
        String numero1 = JOptionPane.showInputDialog("teclea numero : ");
        numero = Integer.parseInt(numero1);
        if (numero > 0) {
            System.out.println("+");
        } else {
            if (0 == numero) {
                System.out.println("0");
            } else {
                System.out.println("-");
            }
        }
    }
}
