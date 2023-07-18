import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceship here.
 * 
 * @author (Nils Muralles, Hugo Barillas & Rodrigo Ramírez) 
 * @version (1.0)
 */
public class spaceship extends Actor
{
    /**
     * Act - do whatever the spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            turn(4);
            move(4);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setRotation(-180);
            turn(4);
            move(4);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            turn(4);
            move(4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            turn(4);
            move(4);
        }
    }
}
