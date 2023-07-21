import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sonidodefondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sonidodefondo extends Actor
{
      private GreenfootSound sound;

    public sonidodefondo() {
        sound = new GreenfootSound("disparo.wav");
        sound.setVolume(50); 
    }

    public void act() {
        if (!sound.isPlaying()) {
            sound.playLoop();
        }
    }
}
