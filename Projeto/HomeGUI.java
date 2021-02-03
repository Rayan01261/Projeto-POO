
package Projeto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeGUI implements ActionListener{
    JButton buttonCor;
    JButton buttonSal;
    JButton buttonPou;
    HomeGUI(){
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.black, 2);
        //panel conta_poupança
        JPanel conta_poupanca = new JPanel();
        conta_poupanca.setBackground(new Color(0x7e8c85));
        conta_poupanca.setBounds(0,300,800,300);
        conta_poupanca.setLayout(null);
        
        //panel conta_corrente
        JPanel conta_corrente = new JPanel();
        conta_corrente.setBackground(new Color(0xd2d6d4));
        conta_corrente.setBounds(0,0,400,300);
        conta_corrente.setLayout(null);
        
        //panel conta_salario
        JPanel conta_salario = new JPanel();
        conta_salario.setBackground(new Color(0x9ea8a3));
        conta_salario.setBounds(400,0,400,300);
        conta_salario.setLayout(null);
        
        //button conta corrente 
        buttonCor = new JButton();
        buttonCor.setBounds(125, 250, 150, 50);
        buttonCor.addActionListener(this);
        buttonCor.setText("Criar");
        
        //button conta salario
        buttonSal = new JButton();
        buttonSal.setBounds(125, 250, 150, 50);
        buttonSal.addActionListener(this);
        buttonSal.setText("Criar");
        
        //button conta poupanca
        buttonPou = new JButton();
        buttonPou.setBounds(320, 200, 150, 50);
        buttonPou.addActionListener(this);
        buttonPou.setText("Criar");
        
        //label conta corrente
        JLabel labelContaCorrente = new JLabel("Conta Corrente");
        labelContaCorrente.setSize(50,50);
        labelContaCorrente.setBounds(120,10,150,50);
        labelContaCorrente.setOpaque(true);
        labelContaCorrente.setBorder(border);
        
        //label conta salario
        JLabel labelContaSalario = new JLabel("Conta Salario");
        labelContaSalario.setSize(50,50);
        labelContaSalario.setBounds(120,10,150,50);
        labelContaSalario.setOpaque(true);
        labelContaSalario.setBorder(border);
        
        //label conta poupanca
        JLabel labelContaPoupanca = new JLabel("Conta Poupança");
        labelContaPoupanca.setSize(50,50);
        labelContaPoupanca.setBounds(320,10,150,50);
        labelContaPoupanca.setOpaque(true);
        labelContaPoupanca.setBorder(border);
        
        
        //frame
        JFrame frame = new JFrame();
        conta_corrente.add(labelContaCorrente);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setTitle("Banco");
        conta_corrente.add(buttonCor);
        conta_salario.add(buttonSal);
        conta_poupanca.add(buttonPou);
        conta_salario.add(labelContaSalario);
        conta_poupanca.add(labelContaPoupanca);
        frame.setLayout(null);
        frame.add(conta_corrente);
        frame.add(conta_salario);
        frame.add(conta_poupanca);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonCor){
            new ContaCorrenteGUI();
        }
        if(e.getSource()==buttonSal){
            new ContaSalGUI();
        }
    }
}
