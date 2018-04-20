import javax.swing.JOptionPane;

public class Exercicio9{

    public static void main (String[]args){

        double numero1= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero positivo"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um numero positivo"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um numero positivo"));
        double numero4 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um numero positivo"));

        if((numero1==numero2) && (numero2==numero3) && (numero3==numero4)){
            JOptionPane.showMessageDialog(null,"Estas medidas podem representar um quadrado");
        }
    }
}