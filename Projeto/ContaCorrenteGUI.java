
package Projeto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ContaCorrenteGUI implements ActionListener {
    JButton button;
    JTextField nome;
    JTextField idade;
    JTextField sexo;
    JTextField cpf;
    JTextField rg;
    ContaCorrenteGUI(){
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.green, 2);
        button = new JButton();
        nome = new JTextField();
        idade = new JTextField();
        sexo = new JTextField();
        cpf = new JTextField();
        rg = new JTextField();
        button.setBounds(250, 250, 200, 50);
        button.addActionListener(this);
        button.setText("Criar");
        nome.setBounds(250,100,300,20);
        idade.setBounds(250,130,300,20);
        sexo.setBounds(250,160,300,20);
        cpf.setBounds(250,190,300,20);
        rg.setBounds(250,220,300,20);

        JLabel label = new JLabel("Criação de Conta corrente");
        
        label.setSize(10,10);
        label.setOpaque(false);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);


        
        JFrame frame = new JFrame();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setTitle("Banco");
        frame.add(button);
        frame.add(nome);
        frame.add(idade);
        frame.add(cpf);
        frame.add(sexo);
        frame.add(rg);
        
        frame.setLayout(null);
        label.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            new HomeGUI();
        }
    }
}
