package eventomouse;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class codigo extends JFrame{
    boton b1;
    boton b2;
    boton b3;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JTextArea a1;
	public codigo(){
		
		super("RECONOCIMIENTO CRIMINAL");
	
		Container container = getContentPane();
		container.setLayout(null);
    a1 =new JTextArea("");
    a1.setBounds(10,350, 300, 200);
    container.add(a1);   
    l1 =new JLabel("RASGOS FACIALES");
    l1.setBounds(10,5, 150, 30);
    container.add(l1);
    l2 =new JLabel("ojos");
    l2.setBounds(10,20, 100, 30);
    container.add(l2);
    l3 =new JLabel("nariz");
    l3.setBounds(10,70, 100, 30);
    container.add(l3);
    l4 =new JLabel("boca");
    l4.setBounds(10,110, 100, 30);
    container.add(l4);
    l5 =new JLabel("DIBUJAR ROSTRO");
    l5.setBounds(10,170, 150, 50);
    container.add(l5);
    l6 =new JLabel("DESCRIPCION DEL ROSTRO");
    l6.setBounds(10,300, 200, 50);
    container.add(l6);
    
		b1 = new boton("");
		b1.setBounds(10, 50, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo=new ImageIcon("recursos/ojos.png");
                b1.setIcon(new ImageIcon(ojo.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
		
		
	        b2 = new boton("");
		b2.setBounds(10, 90, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz=new ImageIcon("recursos/nariz.png");
                b2.setIcon(new ImageIcon(nariz.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b3 = new boton("");
		b3.setBounds(10, 130, 100, 30);
                b3.setBorder(null);
                ImageIcon boca=new ImageIcon("recursos/boca.jpg");
                b3.setIcon(new ImageIcon(boca.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
			}
}
