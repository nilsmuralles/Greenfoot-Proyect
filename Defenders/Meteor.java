import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteor here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class Meteor extends Actor
{
    /**
     * Act - do whatever the meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Meteor()
    {
        GreenfootImage meteorImage = getImage();
        meteorImage.scale(90, 90);
    }
    
    public void move()
    {
        setLocation(getX() - 6, getY());
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
    public void act()
    {
        // Add your action code here.
        move();
    }
}
