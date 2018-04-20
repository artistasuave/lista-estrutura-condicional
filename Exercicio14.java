import javax.swing.JOptionPane;

   public class Exercicio14{

       public static void main (String[]args){

           double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número"));
           double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número diferente do anterior"));
           double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um terceiro número diferente dos anteriores"));

           if((numero1<numero2) && (numero2<numero3)){
               JOptionPane.showMessageDialog(null, numero1 + ", " + numero2 + ", " + numero3);
           }else if((numero1<numero3) && (numero3<numero2)){
               JOptionPane.showMessageDialog(null, numero1 + ", " + numero3 + ", " +numero2);
           }else if((numero2<numero3) && (numero3<numero1)){
               JOptionPane.showMessageDialog(null, numero2 + ", " + numero3 + ", " + numero1);
           }else if((numero2<numero1) && (numero1<numero3)){
               JOptionPane.showMessageDialog(null, numero2 + ", " + numero1 + ", " + numero3);
           }else if((numero3<numero1) && (numero1<numero2)){
               JOptionPane.showMessageDialog(null, numero3 + ", " + numero1 + ", " + numero2);
           }else if((numero3<numero2) && (numero2<numero1)){
               JOptionPane.showMessageDialog(null, numero3 + ", " + numero2 + ", " + numero1);
           }
       }
   }