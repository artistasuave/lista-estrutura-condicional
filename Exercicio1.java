import javax.swing.JOptionPane;

public class Exercicio1{
    
    public static void main (String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));

        if (numero>0){
            JOptionPane.showMessageDialog(null,"Este número é positivo");
        }else{
            JOptionPane.showMessageDialog(null,"Este número não é positivo");
        }
    }
}