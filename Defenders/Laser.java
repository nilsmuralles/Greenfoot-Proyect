import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class Laser extends Actor
{
    public Laser()
    {
        GreenfootImage laserImage = getImage();
        laserImage.scale(90, 90);
    }
    
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        move(10);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
            
        }
    }
    
}
