import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JPanel CalculadoraSwing;
    private JTextField txtOperando;
    private JTextField txtOperador;
    private JTextField txtResultado;
    private JLabel lblOperando;
    private JLabel lblOperador;
    private JPanel CalculadoraPainel;
    private JLabel lblResultado;
    private JButton btnAdicionar;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnSair;
    private JButton btnLimpar;

    public Calculadora() {

        setContentPane(CalculadoraSwing);
        setTitle("Calculadora Java - TP2 Projeto de Bloco Java");
        setSize(400, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtOperando.setText("");
                txtOperador.setText("");
                txtResultado.setText("");
            }
        });

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(txtOperando.getText());
                num2 = Float.parseFloat(txtOperador.getText());

                result = num1 + num2;

                txtResultado.setText(String.valueOf(result));
            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(txtOperando.getText());
                num2 = Float.parseFloat(txtOperador.getText());

                result = num1 - num2;

                txtResultado.setText(String.valueOf(result));
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(txtOperando.getText());
                num2 = Float.parseFloat(txtOperador.getText());

                result = num1 * num2;

                txtResultado.setText(String.valueOf(result));
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, result;
                num1 = Float.parseFloat(txtOperando.getText());
                num2 = Float.parseFloat(txtOperador.getText());

                result = num1 / num2;

                txtResultado.setText(String.valueOf(result));
            }
        });

    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

    }
}
