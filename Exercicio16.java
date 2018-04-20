import javax.swing.JOptionPane;

    public class Exercicio16{

        public static void main (String[]args){

            double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura"));
            String opcaoOrigem = JOptionPane.showInputDialog(null,
            "Selecione a temperatura de origem",
            "CONVERSÃO DE TEMPERATURA",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                " ", "Celsius", "Fahrenheit", "Kelvin"
            },
            " "
        ).toString ();
        String opcaoDestino = JOptionPane.showInputDialog(null,
            "Selecione a temperatura de origem",
            "CONVERSÃO DE TEMPERATURA",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                " ", "Celsius", "Fahrenheit", "Kelvin"
            },
            " "
        ).toString ();

        if((opcaoOrigem.equals("Celsius")) && (opcaoDestino.equals("Fahrenheit"))){
            JOptionPane.showMessageDialog(null,
            "Temperatura em Fahrenheit: " + ((1.8*temperatura)+32));
        }

        }
    }