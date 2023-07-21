import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image extends Actor
{
    /**
     * Act - do whatever the Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here. 
    }
    public void animate()
    {
        int inicialPosX = getX();
        int inicialPosY = getY();
        
        Greenfoot.delay(50);
        setLocation(inicialPosX+5, inicialPosY+10);
        Greenfoot.delay(50);
        setLocation(inicialPosX-5, inicialPosY+10);
        Greenfoot.delay(50);
        setLocation(inicialPosX+5, inicialPosY-10);
        Greenfoot.delay(50);
        setLocation(inicialPosX, inicialPosY);
    }
    public void animateButton()
    {
        int inicialPosX = getX();
        int inicialPosY = getY();
        
        Greenfoot.delay(50);
        setLocation(inicialPosX+5, inicialPosY);
        Greenfoot.delay(50);
        setLocation(inicialPosX-5, inicialPosY);
    }
}
