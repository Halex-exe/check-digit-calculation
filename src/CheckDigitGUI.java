import javax.swing.*;

public class CheckDigitGUI extends JFrame{
    private JPanel mainPainel;
    private JLabel codeField;

    public CheckDigitGUI (String title){
        super (title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPainel);
        this.setResizable(false);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new CheckDigitGUI("Calculadora de digito vérificador");
        frame.setVisible(true);
    }
}
