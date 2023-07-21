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
    int speed;
    private boolean removed = false;
    
    public Meteor(int speed)
    {
        GreenfootImage meteorImage = getImage();
        meteorImage.scale(50, 50);
        this.speed = speed;
    }
    
    public void move()
    {
        setLocation(getX() - speed, getY());
        if (isTouching(Laser.class)) {
            getWorld().removeObject(this);
            removed = true;
            MyWorld.score.setValue(MyWorld.score.getValue()+1);
        }
        if (removed == false) {
            if (isAtEdge()) {
                getWorld().removeObject(this);
            }
        }
    }
    
    public void act()
    {
        // Add your action code here.
        move();
    }
}
