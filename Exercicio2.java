import javax.swing.JOptionPane;

public class Exercicio2{

    public static void main (String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));

        if (numero<0){
            JOptionPane.showMessageDialog(null,"Este número é negativo");
        }else{
            JOptionPane.showMessageDialog(null,"Este número não é negativo");
        }
    }
}