import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class Menu extends World
{
    Play playButton = new Play();
    Logo gameLogo = new Logo();
    Exit exitButton = new Exit();
    /**
     * Constructor for objects of class menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(910, 584, 1); 
        prepare();      
    }
    
    private void prepare() {
        addObject(gameLogo, 700, 350);
        addObject(playButton, 300, 200);
        addObject(exitButton, 300, 350);
    }
    
    public void act(){
        if (Greenfoot.mouseMoved(playButton)) {
            playButton.setImage("jugarselect.png");
            gameLogo.animate();
            playButton.animateButton();
        } else {
            playButton.setImage("jugarmenu.png");
        }
        if (Greenfoot.mouseClicked(playButton)) {
            Greenfoot.setWorld(new MyWorld());
        }
        
        if (Greenfoot.mouseMoved(exitButton)) {
            exitButton.setImage("salirselect.png");
            gameLogo.animate();
            exitButton.animateButton();
        } else {
            exitButton.setImage("salirmenu.png");
        }
        if (Greenfoot.mouseClicked(exitButton)) {
            Greenfoot.stop();
        }
    }
}
