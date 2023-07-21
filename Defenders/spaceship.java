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
    int spaceshipVelocity = 6;
    
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
            setLocation(getX(), getY() - spaceshipVelocity);
        
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - spaceshipVelocity, getY());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + spaceshipVelocity);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + spaceshipVelocity, getY());
        }
        if (isTouching(Meteor.class)){
            setLocation(77,304);
            MyWorld.lifeCount.setValue(MyWorld.lifeCount.getValue()-1);
            if (MyWorld.lifeCount.getValue() == 0) {
                MyWorld.score.setValue(0);
                MyWorld.backgroundMusic.stop();
                Greenfoot.setWorld(new Menu());
            }
        }
        if (Greenfoot.isKeyDown("space"))
        {
            if (getWorld().getObjects(Laser.class).size() < 1) 
            {
                Laser shoot = new Laser();
                getWorld().addObject(shoot,getX(),getY()); 
                Greenfoot.playSound("Disparo2.wav");
            }
        }
    }
}
