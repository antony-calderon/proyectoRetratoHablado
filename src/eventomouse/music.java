/*
 * To change this license header, choose License Headers in Project Properties.
 * Tos change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventomouse;

import java.applet.AudioClip;


public class music extends Thread {
    
    @Override
    public void run(){
      AudioClip sonido1;
        sonido1=java.applet.Applet.newAudioClip(getClass().getResource("/eventomouse/Martin.wav"));
        sonido1.play();
    }
}
