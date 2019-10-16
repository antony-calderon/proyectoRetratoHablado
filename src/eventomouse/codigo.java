package eventomouse;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
    BotonAccion m1;
    BotonImagen b1;
    BotonImagen b2;
    BotonImagen b3;
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
    a1.setBounds(475,340, 300, 50);
    container.add(a1);  
    
    m1=new BotonAccion("");
    m1.setBounds(520, 410, 200, 30);
    m1.setText("MOSTRAR DESCRIPCION");
    container.add(m1);
    
    l1 =new JLabel("RASGOS FACIALES");
    l1.setBounds(350,1, 200, 30);
    container.add(l1);
    
    l2 =new JLabel("Ojos");
    l2.setBounds(47,30, 100, 30);
    container.add(l2);
    
    l3 =new JLabel("nariz");
    l3.setBounds(145,30, 100, 30);
    container.add(l3);
    
    l4 =new JLabel("boca");
    l4.setBounds(237,30, 100, 30);
    container.add(l4);
    
    l5 =new JLabel("DIBUJAR ROSTRO");
    l5.setBounds(500,30, 150, 30);
    container.add(l5);
    
    l6 =new JLabel("DESCRIPCION DEL ROSTRO");
    l6.setBounds(475,300, 200, 30);
    container.add(l6);
    
    ////////////eye//////////////////
		b1 = new BotonImagen("");
		b1.setBounds(10, 60, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo1=new ImageIcon("recursos/ojos/OJ1.png");
                ojo1.setDescription("OJ1");
                b1.setIcon(new ImageIcon(ojo1.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 110, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo2=new ImageIcon("recursos/ojos/OJ2.png");
                ojo2.setDescription("OJ2");
                b1.setIcon(new ImageIcon(ojo2.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 160, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo3=new ImageIcon("recursos/ojos/OJ3.png");
                ojo3.setDescription("OJ3");
                b1.setIcon(new ImageIcon(ojo3.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
              
                b1 = new BotonImagen("");
		b1.setBounds(10, 210, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo4=new ImageIcon("recursos/ojos/OJ4.png");
                ojo4.setDescription("OJ4");
                b1.setIcon(new ImageIcon(ojo4.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 260, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo5=new ImageIcon("recursos/ojos/OJ5.png");
                ojo5.setDescription("OJ5");
                b1.setIcon(new ImageIcon(ojo5.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 310, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo6=new ImageIcon("recursos/ojos/OJ6.png");
                ojo6.setDescription("OJ6");
                b1.setIcon(new ImageIcon(ojo6.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 360, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo7=new ImageIcon("recursos/ojos/OJ7.png");
                ojo7.setDescription("OJ7");
                b1.setIcon(new ImageIcon(ojo7.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
                b1 = new BotonImagen("");
		b1.setBounds(10, 410, 100, 30);
                b1.setBorder(null);
                ImageIcon ojo8=new ImageIcon("recursos/ojos/OJ8.png");
                ojo8.setDescription("OJ8");
                b1.setIcon(new ImageIcon(ojo8.getImage().getScaledInstance(b1.getWidth(), b1.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b1);
                
    
         
    ////////////nose///////////////////
		
                
		b2 = new BotonImagen("");
		b2.setBounds(110, 60, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz1=new ImageIcon("recursos/narices/NA1.png");
                nariz1.setDescription("NA1");
                b2.setIcon(new ImageIcon(nariz1.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 110, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz2=new ImageIcon("recursos/narices/NA2.png");
                nariz2.setDescription("NA2");
                b2.setIcon(new ImageIcon(nariz2.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 160, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz3=new ImageIcon("recursos/narices/NA3.png");
                nariz3.setDescription("NA3");
                b2.setIcon(new ImageIcon(nariz3.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 210, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz4=new ImageIcon("recursos/narices/NA4.png");
                nariz4.setDescription("NA4");
                b2.setIcon(new ImageIcon(nariz4.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 260, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz5=new ImageIcon("recursos/narices/NA5.png");
                nariz5.setDescription("NA5");
                b2.setIcon(new ImageIcon(nariz5.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 310, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz6=new ImageIcon("recursos/narices/NA6.png");
                nariz6.setDescription("NA6");
                b2.setIcon(new ImageIcon(nariz6.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 360, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz7=new ImageIcon("recursos/narices/NA7.png");
                nariz7.setDescription("NA7");
                b2.setIcon(new ImageIcon(nariz7.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                b2 = new BotonImagen("");
		b2.setBounds(110, 410, 100, 30);
                b2.setBorder(null);
                ImageIcon nariz8=new ImageIcon("recursos/narices/NA8.png");
                nariz8.setDescription("NA8");
                b2.setIcon(new ImageIcon(nariz8.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b2);
                
                
                
    //////////mouth//////////////
	        
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 60, 100, 30);
                b3.setBorder(null);
                ImageIcon boca1=new ImageIcon("recursos/bocas/BO1.png");
                boca1.setDescription("BO1");
                b3.setIcon(new ImageIcon(boca1.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 110, 100, 30);
                b3.setBorder(null);
                ImageIcon boca2=new ImageIcon("recursos/bocas/BO2.png");
                boca2.setDescription("BO2");
                b3.setIcon(new ImageIcon(boca2.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 160, 100, 30);
                b3.setBorder(null);
                ImageIcon boca3=new ImageIcon("recursos/bocas/BO3.png");
                boca3.setDescription("BO3");
                b3.setIcon(new ImageIcon(boca3.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 210, 100, 30);
                b3.setBorder(null);
                ImageIcon boca4=new ImageIcon("recursos/bocas/BO4.png");
                boca4.setDescription("BO4");
                b3.setIcon(new ImageIcon(boca4.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 260, 100, 30);
                b3.setBorder(null);
                ImageIcon boca5=new ImageIcon("recursos/bocas/BO5.png");
                boca5.setDescription("BO5");
                b3.setIcon(new ImageIcon(boca5.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 310, 100, 30);
                b3.setBorder(null);
                ImageIcon boca6=new ImageIcon("recursos/bocas/BO6.png");
                boca6.setDescription("BO6");
                b3.setIcon(new ImageIcon(boca6.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 360, 100, 30);
                b3.setBorder(null);
                ImageIcon boca7=new ImageIcon("recursos/bocas/BO7.png");
                boca7.setDescription("BO7");
                b3.setIcon(new ImageIcon(boca7.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
                b3 = new BotonImagen("");
		b3.setBounds(200, 410, 100, 30);
                b3.setBorder(null);
                ImageIcon boca8=new ImageIcon("recursos/bocas/BO8.png");
                boca8.setDescription("BO8");
                b3.setIcon(new ImageIcon(boca8.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
                container.add(b3);
                
			}
}
