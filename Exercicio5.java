import javax.swing.JOptionPane;

public class Exercicio5{

    public static void main (String[]args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        
        if ((numero%2)!=0){
            JOptionPane.showMessageDialog(null,"Este número é ímpar");
        }else{
            JOptionPane.showMessageDialog(null,"Este número não é ímpar");
        }
    }
}