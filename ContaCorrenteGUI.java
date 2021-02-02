
package prova;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContaCorrenteGUI implements ActionListener {
    JButton button;
    ContaCorrenteGUI(){
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.green, 2);
        JLabel label = new JLabel("Bem Vindo a Criação de Conta corrente");
        button = new JButton();
        button.setBounds(145, 200, 200, 50);
        button.addActionListener(this);
        button.setText("Criar");
        ImageIcon images = new ImageIcon("C:\\Users\\Rayan\\Documents\\NetBeansProjects\\Prova\\src\\prova\\logo.png"); 
        label.setIcon(images);
        label.setSize(200,200);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setOpaque(true);
        label.setBorder(border);
        
        JFrame frame = new JFrame();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setIconImage(images.getImage());
        frame.setResizable(true);
        frame.setTitle("Banco");
        frame.add(button);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            new HomeGUI();
        }
    }
}
