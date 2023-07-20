import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceship here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spaceship()
    {
        GreenfootImage spaceshipImage = getImage();
        spaceshipImage.scale(90, 90);
    }
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 4);
        
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4, getY());
        }
        if (isTouching(Meteor.class)){
            setLocation(77,304);
        }
    }
}
