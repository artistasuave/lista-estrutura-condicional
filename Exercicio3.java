import javax.swing.JOptionPane;

    public class Exercicio3{

        public static void main(String[]args){
            
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro diferente do anterior"));
            int opcao = JOptionPaneshowOptionDialog(
                null,
                "Selecione a opção desejada",
                "MENU",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "SOMAR", "SUBTRAIR", "MULTIPLICAR", "DIVIDIR"
                }
            );
            
        }

    }