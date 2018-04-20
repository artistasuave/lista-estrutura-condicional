import javax.swing.JOptionPane;

public class Exercicio13{

    public static void main (String[]args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número qualquer"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número diferente do anterior"));

        if (numero1>numero2){
            JOptionPane.showMessageDialog(null,numero2);
        }else{
            JOptionPane.showMessageDialog(null,numero1);
        }
        
    }
}