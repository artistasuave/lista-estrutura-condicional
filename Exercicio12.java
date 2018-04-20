import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main (String[]args){

    double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
    double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número diferente do anterior"));

    if(numero1>numero2){
        JOptionPane.showMessageDialog(null,
        numero1);
    }else{
        JOptionPane.showMessageDialog(null,
        numero2);
    }

    }
}