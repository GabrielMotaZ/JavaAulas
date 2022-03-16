import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panTop = new JPanel(new BorderLayout());
        JPanel panMiddle = new JPanel(new BorderLayout());
        JPanel panBottom = new JPanel(new BorderLayout());
        JPanel panOuter = new JPanel(new BorderLayout());
        panTop.setLayout(new FlowLayout());
        panMiddle.setLayout(new FlowLayout());
        panTop.setLayout(new FlowLayout());
        JLabel lblTitulo = new JLabel("Cálculo");
        JLabel lblPeso = new JLabel("Peso");
        JLabel lblAltura = new JLabel("Altura");
        JButton btnCalcular = new JButton();
        JTextField altura = new JTextField(10);
        JTextField peso = new JTextField(10);
        btnCalcular.setText("Calcular");
        panTop.add(lblTitulo);
        panMiddle.add(lblAltura);
        panMiddle.add(altura);
        panMiddle.add(lblPeso);
        panMiddle.add(peso);
        panBottom.add(btnCalcular);
        panOuter.add(panTop,BorderLayout.NORTH);
        panOuter.add(panMiddle,BorderLayout.CENTER);
        panOuter.add(panBottom,BorderLayout.PAGE_END);
        frame.add(panOuter);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
