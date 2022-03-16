import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


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
        JTextField txtfAltura = new JTextField(10);
        JTextField txtfPeso = new JTextField(10);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pessoa pessoa = new Pessoa();
                pessoa.peso = Float.parseFloat(txtfPeso.getText());
                pessoa.altura = Float.parseFloat(txtfAltura.getText());
                JOptionPane.showMessageDialog(frame, pessoa.CalcularIMC());
            }
        });
        btnCalcular.setText("Calcular");
        panTop.add(lblTitulo);
        panMiddle.add(lblAltura);
        panMiddle.add(txtfAltura);
        panMiddle.add(lblPeso);
        panMiddle.add(txtfPeso);
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
