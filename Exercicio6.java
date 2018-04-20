import javax.swing.JOptionPane;

public class Exercicio6{

    public static void main (String[]args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));

        if (numero!=1){
            JOptionPane.showMessageDialog(null,"Este número é diferente de 1");
        }else{
            JOptionPane.showMessageDialog(null,"Este número não é diferente de 1");
        }
    }
}