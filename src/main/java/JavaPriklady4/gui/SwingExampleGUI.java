package JavaPriklady4.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SwingExampleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Swing Title"); // vytvoríme okno s textom v titulke

        frame.setMinimumSize(new Dimension(400, 200)); // nastavili sme rozmer JFrame ,resp. okna na 400x200px
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// keď kliknem na 'x'tak sa okno zavrie a program UKONCI !!

        frame.setLocationRelativeTo(null); // vycentrovanie okna
        // frame.setLocation(new Point(400,300));

        //JFrame by mal obsahovať panelm teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);// layout panel bude null, ciže prázdny

        frame.setContentPane(panel); // vloženie panelu do frame-u

        //JText
        JTextField textField = new JTextField();
        textField.setBounds(95, 20, 200, 30);// x,y, šírka, výška POZOR v ramci frame-u(okna) je fixné!
        textField.setHorizontalAlignment(JTextField.RIGHT); // nastavíme kurzor napravo
        panel.add(textField);


        JLabel labelText = new JLabel("Hello World Swing");
        labelText.setBounds(140, 50, 150, 20);// x,y, šírka, výška
        panel.add(labelText);

        JButton btn0k = new JButton("Vypíš"); // tlačidlo
        btn0k.setBounds(100, 100, 80, 20); // x,y, šírka, výška
        panel.add(btn0k);


        //vytvorenie "anomymnej triedy vnútry triedy"
        btn0k.addActionListener(new ActionListener() { // slúži na "odchytenie" cize spracovania(zatlačenia) tlačidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                labelText.setText(textField.getText());
            }
        });

        JButton btnCancel = new JButton("Cancel"); // tlačidlo
        btnCancel.setBounds(210, 100, 80, 20); // x,y, šírka, výška
        panel.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() { // Tlačidlo cancel
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

        // display it
        frame.pack();
        frame.setVisible(true);


    }
}
