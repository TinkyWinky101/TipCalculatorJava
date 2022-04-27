import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipGUI {
    private JPanel panel1;
    private JButton calculateBttn;
    private JTextField serviceField1;
    private JTextField tipField1;
    private JTextField tipField2;
    private JTextField tipField3;
    private JTextField tipField4;
    private JTextField tipField5;
    private JTextField tipField6;
    private JLabel service1Label;
    private JLabel service2Label;
    private JLabel service3Label;
    private JLabel service4Label;
    private JLabel service5Label;
    private JLabel service6Label;
    private JLabel tip1Label;
    private JLabel tip2Label;
    private JLabel tip3Label;
    private JLabel tip4Label;
    private JLabel tip5Label;
    private JLabel tip6Label;
    private JLabel fullTipLabel;
    private JTextField serviceField2;
    private JTextField serviceField3;
    private JTextField serviceField4;
    private JTextField serviceField5;
    private JTextField serviceField6;
    private JTextField fullTipField6;
    private JButton exitButton;

    public TipGUI() {
        JFrame frame = new JFrame("TipGUI");
        frame.setContentPane(new TipGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        calculateBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
