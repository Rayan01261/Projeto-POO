
package prova;
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
    JButton button;
    JButton buttonSal;
    HomeGUI(){
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.black, 2);
        //panel conta_corrente
        JPanel conta_corrente = new JPanel();
        conta_corrente.setBackground(Color.red);
        conta_corrente.setBounds(0,0,400,300);
        conta_corrente.setLayout(null);
        
        //panel conta_salario
        JPanel conta_salario = new JPanel();
        conta_salario.setBackground(Color.yellow);
        conta_salario.setBounds(0,300,400,260);
        conta_salario.setLayout(null);
        
        //button conta corrente 
        button = new JButton();
        button.setBounds(125, 250, 150, 50);
        button.addActionListener(this);
        button.setText("Criar");
        
        //button conta salario
        buttonSal = new JButton();
        buttonSal.setBounds(120, 210, 150, 50);
        buttonSal.addActionListener(this);
        buttonSal.setText("Criar");
        //label
        JLabel label = new JLabel("Conta Corrente");
        ImageIcon images = new ImageIcon("C:\\Users\\Rayan\\Documents\\NetBeansProjects\\Prova\\src\\prova\\logo.png"); 
        //label.setIcon(images);
        label.setSize(50,50);
        label.setBounds(120,10,150,50);
        label.setOpaque(true);
        label.setBorder(border);
        
        //frame
        JFrame frame = new JFrame();
        conta_corrente.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setIconImage(images.getImage());
        frame.setResizable(false);
        frame.setTitle("Banco");
        conta_corrente.add(button);
        conta_salario.add(buttonSal);
        frame.setLayout(null);
        frame.add(conta_corrente);
        frame.add(conta_salario);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            new ContaCorrenteGUI();
        }
        if(e.getSource()==buttonSal){
            new ContaSalGUI();
        }
    }
}
