import javax.swing.JOptionPane;

public class Exercicio7{

    public static void main (String[]args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        if((numero%2)==0){
            JOptionPane.showMessageDialog(null,"Este número é par");
        }if((numero%2)!=0){
            JOptionPane.showMessageDialog(null,"Este número é ímpar");
        }if(numero==0){
            JOptionPane.showMessageDialog(null,"Este número é neutro");
        }if(numero>0){
            JOptionPane.showMessageDialog(null,"Este número é positivo)");
        }if(numero<0){
            JOptionPane.showMessageDialog(null,"Este número é negativo");
        }if(numero>10){
            JOptionPane.showMessageDialog(null,"Este número é maior do que 10");
        }else{
            JOptionPane.showMessageDialog(null,"Este número não é maior do que 10");
        }if(numero<=50){
            JOptionPane.showMessageDialog(null,"Este número é menor ou igual a 50");
        }if(numero<-10){
            JOptionPane.showMessageDialog(null,"Este número é menor do que -10");
        }if(numero>=30){
            JOptionPane.showMessageDialog(null,"Este número é maior ou igual a 30");
        }if(numero!=1){
            JOptionPane.showMessageDialog(null,"Este número é diferente de 1");
        }
    }
}