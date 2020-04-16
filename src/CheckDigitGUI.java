import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class CheckDigitGUI extends JFrame{
    private JPanel mainPainel;
    private JLabel codeField;
    private JButton bt;
    private JTextField textFieldCode;
    private JLabel lbDigit;

    public CheckDigitGUI (String title){
        super (title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPainel);
        this.setResizable(false);
        this.pack();
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int a = 0;
                int b = 0;
                int c = 0;
                int d;
                int dv;

                int[] codeReverse = reverse(textFieldCode.getText());

                for (int i = 0; i < codeReverse.length; i++) {
                    if ((i % 2) == 0) {
                        a += codeReverse[i];
                    }else{
                        c += codeReverse[i];
                    }
                    b = a * 3;
                }
                d = b + c;
                dv = (10 - (d % 10)) % 10;
                lbDigit.setText(Integer.toString(dv));
            }

            public int[] reverse (String code){
                var codeSplit = code.split("");
                int[] codeReversed = Arrays.stream(codeSplit).mapToInt(Integer::parseInt).toArray();
                for(int i=0; i<codeReversed.length/2; i++){
                    int temp = codeReversed[i];
                    codeReversed[i] = codeReversed[codeReversed.length -i -1];
                    codeReversed[codeReversed.length -i -1] = temp;
                }

                return codeReversed;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CheckDigitGUI("Calculadora de digito verificador");
        frame.setVisible(true);
    }
}
