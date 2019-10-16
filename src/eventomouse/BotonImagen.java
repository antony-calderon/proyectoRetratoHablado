package eventomouse;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;


public class BotonImagen extends JButton implements MouseMotionListener{

    public BotonImagen(String text){
		//super.setText(text);
		setContentAreaFilled(false);
		/*Dimension tamano = getPreferredSize();
                tamano.width = tamano.height = Math.max( tamano.width,tamano.height );
                setPreferredSize( tamano );*/
		addMouseMotionListener(this);

	}
    @Override
    public void mouseDragged(MouseEvent e) {

		setLocation(
				this.getX() + e.getX() - this.getWidth() / 2,
				this.getY() + e.getY() - this.getHeight() / 2
				);
	}
    @Override
    public void mouseMoved(MouseEvent e) {
       
    }
    
}
