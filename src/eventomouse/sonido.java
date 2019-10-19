package eventomouse;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

public class sonido extends JButton implements AudioClip {
    
    Clip sound;
    AudioInputStream aS;
    String songName;
    
    public sonido(){
        
        try{
            sound = AudioSystem.getClip();
        }
        catch(LineUnavailableException e1){
            System.out.print("Error 1");
        }
    }
    
    public void inicializarClip(String ubicacion){
        try{
            aS= AudioSystem.getAudioInputStream(getClass().getResourceAsStream("par.mp3"+ubicacion));
            sound.open(aS);
            sound.setFramePosition(0);
            sound.start();
        }
        catch(LineUnavailableException e1){
            System.out.print("Error 1");
        }
        catch(UnsupportedAudioFileException e2){
             System.out.print("Archivo  no soportado");
        }
        catch(IOException e3){
            System.out.print("No se encontró el archivo");
        }
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
